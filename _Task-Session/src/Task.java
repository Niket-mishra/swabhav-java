import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] arr = {2, 1,3,0};
        int n = arr.length;
        int index = 0;
        int count = 0;
        int pro = 1;
        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
                index = i;

            }
        }
        if (count == 0) {
            for (int a : arr) {
                pro *= a;
            }
            for (int i = 0; i < arr1.length; i++) {
                arr1[i]= pro/arr[i];
            }
        }
        if (count == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    continue;
                }
                pro = pro * arr[i];
            }
            arr1[index] = pro;
            for (int i = 0; i < arr1.length; i++) {
                if (i == index) {
                    arr1[i]= pro;

                }
            }
        }
        if (count > 1) {
            pro = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1[index] = pro;
            }
        }
        for (int a : arr1) {
            System.out.println(a);
        }
    }
}



