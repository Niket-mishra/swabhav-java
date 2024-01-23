import java.util.Scanner;

public class Array03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Search :");
        int key = sc.nextInt();

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int i = linearSearch1(numbers, key);

        if (i != -1) {
            System.out.println(key + " is found at index " + i);
        } else {
            System.out.println(key + " is not found");
        }
    }

    private static int linearSearch1(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;


    }

}
