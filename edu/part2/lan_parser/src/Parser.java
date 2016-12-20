import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by Gil on 18-Dec-16.
 */
public class Parser implements Callable<Map<String, Integer>> {

    private Map<String, Integer> tempMap = new HashMap<>();

    String str;

    public Parser(String str) {
        this.str = str;
    }

    private Map<String, Integer> parse(String str) {
        String[] strs = str.toLowerCase()
                .replaceAll("\\p{Punct}", " ")
                .split(" ");
        for (String s : strs
                ) {
            Integer count;
            if ((count = tempMap.get(s)) != null) {
                count++;
                tempMap.replace(s, count);
            } else {
                if (!s.equals("") && !s.equals(" ")) {
                    tempMap.put(s, 1);
                }
            }
        }
        return tempMap;
    }

    @Override
    public Map<String, Integer> call() throws Exception {
        return parse(str);
    }
}