public class AdditionOfSquareMatrix {
    public static void main(String[] args) {

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int count = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = count++;
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = i + j;
            }
        }
        
        int[][] matrix3 = new int[3][3];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        printMatrix(matrix3);

    }

    private static void printMatrix(int[][] matrix3) {
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                System.out.print(matrix3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
