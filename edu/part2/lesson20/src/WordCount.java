import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

    private static Map<String, Integer> mostPopular = new HashMap<>();

    private static final String FILE_NAME = "E:\\work\\java\\edu\\part1\\file_top100words\\wp1.txt";

    private byte[] bytes = Files.readAllBytes(new File(FILE_NAME).toPath());

    public String all = new String(bytes);

    public WordCount() throws IOException {
    }

    private static void parse(String str, Map<String, Integer> map) {
        String[] strs = str.toLowerCase()
                .replaceAll("\\p{Punct}", " ")
                .split(" ");
        for (String s : strs
                ) {
            Integer count;
            if ((count = map.get(s)) != null) {
                count++;
                map.replace(s, count);
            } else {
                if (!s.equals("") && !s.equals(" ")) {
                    map.put(s, 1);
                }
            }
        }
    }

    public static synchronized void collectMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()){

            String key = pair.getKey();
            Integer value = pair.getValue();

            if (mostPopular.containsKey(key))
                mostPopular.put(key, mostPopular.get(key) + value);
            else mostPopular.put(key, value);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        int cpus = Runtime.getRuntime().availableProcessors();
        List<CountThread> threads = new ArrayList<>(cpus);

        WordCount wordCount = new WordCount();

        long timeout= System.currentTimeMillis();

        for (int i = 0; i < cpus; i++) {

            int startStr = ((wordCount.all.length()/cpus)*i);
            int endStr = startStr + ((wordCount.all.length()/cpus));

            threads.add(new CountThread(wordCount.all.substring(startStr, endStr)));
            System.out.println(wordCount.all.substring(startStr, endStr));
        }

        for (CountThread thread: threads) {
            thread.start();
        }

        for (CountThread thread: threads) {
            thread.join();
        }

        timeout = System.currentTimeMillis() - timeout;


        System.out.println();
        mostPopular.forEach((K, V) -> System.out.println(K + " : " + V));

        System.out.println("\nВыполнено за : " + timeout + " ms");

    }

    private static class CountThread extends Thread {
        private final String str;

        private Map<String, Integer> words = new HashMap<>();

        private CountThread(String str) {
            this.str = str;
        }

        @Override
        public void run() {
            parse(str, words);
            collectMap(words);
        }
    }

}
