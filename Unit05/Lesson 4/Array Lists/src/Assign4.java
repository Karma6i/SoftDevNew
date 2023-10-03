import java.util.ArrayList;
import java.util.Arrays;

public class Assign4 {
    public static void main(String[] args) throws Exception {
    
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        myList.add(6);

        for(int i = 0; i < 6; i ++){
            int sum = myList.addAll(i, myList);
        }

        System.out.println(sum);


}
}