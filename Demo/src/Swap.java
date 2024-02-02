import static java.util.Collections.swap;

public class Swap {
//    static void Swaps(int a, int b){
//         int temp =a;
//        a=b;
//        b=temp;
//    }
//
//    public static void main(String[] args) {
//        int a = 10, b = 20 ;
//        Swaps(a,b);
//        System.out.println(a+" : "+ b);
//    }

    static void SquareNumbers(int [] items){
        for (int i = 0; i < items.length; i++) {
            items[i]=items[i]*items[i];

        }

    }

    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,7};
        SquareNumbers(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }


}
