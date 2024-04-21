import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        String result = "value1=====\n\n\n=====\n\nvalue2=====\nvalue3\n";
        String[] splits = result.split("=====");

        // Convert array to list
        List<String> splitsList = new ArrayList<>(Arrays.asList(splits));

        // Remove empty strings and strings containing only newlines
        splitsList.removeIf(s -> s.trim().isEmpty());

        // Convert list back to array
        splits = splitsList.toArray(new String[0]);

        // Print the result
        for (String split : splits) {
            System.out.println(split);
        }
    }
}
