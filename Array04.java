import java.util.Scanner;

public class Array04 {
    public static int BinarySearch(int[] a, int key) {
        int l = 0, h = a.length - 1, mid = 0;

        while (l <= h)
        {
            mid=(h + l) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Search :");
        int key = sc.nextInt();
        int index = BinarySearch(a, key);
        if (index != -1) {
            System.out.println("Number Present in The Array At Index "+index);
        }
        else{
            System.out.println(key +" not present in The Array");
        }


    }
}