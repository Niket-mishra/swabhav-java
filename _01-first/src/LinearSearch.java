import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number to search :");
        int key=sc.nextInt();

        int index  = linearSearch(numbers,key);

        if(index!=-1){
            System.out.println(key+" found at index "+index);
        }
        else {
            System.out.println(key + " was not found!");
        }
    }

    static int linearSearch(int[] numbers, int key) {
        for(int index = 0;index<numbers.length;index++){
            if(numbers[index]==key){
                return index;
            }
        }
        return -1;
    }
}
