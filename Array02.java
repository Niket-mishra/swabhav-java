import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int input = sc.nextInt();
        boolean b = false;


        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == input) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println(input +" is Present");
        }
        else {
            System.out.println(input + " is Not Present");
        }
        }
        }






