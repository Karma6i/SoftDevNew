import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        HashMap<String, String> courseGrades = new HashMap<String, String>();
        courseGrades.put("Algebra 2 ", " A");
        courseGrades.put("Psychology ", " B");
        courseGrades.put("Dance ", " B-");
        courseGrades.put("WebDev ", " A");
        courseGrades.put("English ", " A");

        System.out.println(courseGrades);
    }
}