import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * Created by Gil on 18-Dec-16.
 */
public class Server {

    private static final String FILE_NAME = "E:\\work\\java\\edu\\part1\\file_top100words\\wp.txt";

    private static volatile Map<String, Integer> finalMap = new ConcurrentHashMap<>();

    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public static void copyMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()){

            String key = pair.getKey();
            Integer value = pair.getValue();

            if (finalMap.containsKey(key))
                finalMap.put(key, finalMap.get(key) + value);
            else finalMap.put(key, value);
        }
    }

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

        int cpus = Runtime.getRuntime().availableProcessors();

        ExecutorService executor = Executors.newFixedThreadPool(cpus);

        List<String> lines = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);

        for (String line : lines) {

            Callable<Map<String, Integer>> callable = new Parser(line);

            Future<Map<String, Integer>> future = executor.submit(callable);

            copyMap(future.get());

        }

        executor.shutdown();

        System.out.println("10 наиболее популярных слов: ");
        sortByValue(finalMap).forEach((K, V) -> System.out.println(K + " : " + V));

    }


}
