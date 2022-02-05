import java.util.Scanner;

public class driver {
    static void multiplyBy11(String numbers){
        StringBuilder newNumber = new StringBuilder();

        int carryOne = 0;

        char[] arr = numbers.toCharArray();
        newNumber.append(arr[arr.length-1]);
        for(int i = arr.length - 1; i > 0; i--){
            int sum = Character.getNumericValue(arr[i]) + Character.getNumericValue(arr[i-1]) + carryOne;
            int x = sum % 10;
            newNumber.insert(0,x);
            carryOne = ((sum > 10 && x != 0) || (sum == 10)) ? 1 : 0;

            if(i == 1 && sum > 10){
                newNumber.insert(0, Character.getNumericValue(arr[0]) + 1);
            }else if(i == 1){
                newNumber.insert(0, Character.getNumericValue(arr[0]));
            }
        }
        System.out.println(newNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        String input;
        multiplyBy11("11");
        multiplyBy11("111111111"); // ➞ "1222222221"
        multiplyBy11("1213200020"); // ➞ "13345200220"
        multiplyBy11("1217197941"); // ➞ "13389177351"
        multiplyBy11("9473745364784876253253263723"); // ➞ "104211199012633638785785900953"

        System.out.println("Would you like to try some of your own?: (y/n)");
        String response = sc.nextLine();
        if(response.equals("y") || response.equals("Y")){
            while(run){
                System.out.println("Input the numbers please:");
                input = sc.nextLine();
                input = input.replaceAll("[^\\d]", "");
                multiplyBy11(input);
                System.out.println("Would you like to try some more?: (y/n)");
                response = sc.nextLine();
                if(response.equals("n") || response.equals("N"))
                    run = false;
            }
        }
        else
            System.out.println("No Problem!");
    }
}
