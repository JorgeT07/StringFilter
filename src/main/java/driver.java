import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class driver {

    static ArrayList<Integer> getNums(Object[] array){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if(array.length == 0){
            return null;
        }
        for(Object items : array){
            if(items instanceof Integer && items!= null){
                numbers.add((Integer) items);
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object[] array1 = {1, 2, "a", "b"}; // First array
        Object[] array2 = {1, "a", "b", 0, 15}; // Second array
        Object[] array3 = {1, 2, "aasf", "1", "123", 123, 2}; // Third array

        ArrayList<Integer> result = getNums(array3);

        for(Integer nums : result){
            System.out.println(nums);
        }
    }
}
