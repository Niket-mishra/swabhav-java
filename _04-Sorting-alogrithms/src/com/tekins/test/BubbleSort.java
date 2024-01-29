package com.tekins.test;

    class BubbleSort {
        void bubbleSort(int[] arr)
        {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }


        void printArray(int[] arr)
        {
            for (int j : arr) System.out.print(j + " ");
            System.out.println();
        }


        public static void main(String[] args)
        {
            BubbleSort obj = new BubbleSort();
            int[] arr = { 6, 4, 2, 1, 5, 11, 9 };
            obj.bubbleSort(arr);
            System.out.println("Sorted array");
            obj.printArray(arr);
        }
    }

