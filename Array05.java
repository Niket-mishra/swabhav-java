import java.util.Scanner;

public class Array05 {
    public static int InterpolationSearch(int[] a, int key) {
        int l = 0, h = a.length - 1;
        int probe;
        while (l <= h && (a[h] >= key) && (a[l] <= key)) {
            probe = (key - a[l]) * (h - l);
            int mid = l + probe / (a[h] - a[l]);
            if (key < a[mid]) {
                h = mid - 1;
            } else if (key > a[mid]) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {10, 12, 15, 20, 22, 25, 30, 33, 39, 40, 42, 50, 55, 60, 64, 70, 77, 80, 88, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Search :");
        int key = sc.nextInt();
        int index = InterpolationSearch(a, key);
        if (index != -1) {
            System.out.println("Number Present in The Array At Index " + index);
        } else {
            System.out.println(key + " not present in The Array");
        }
    }
}
