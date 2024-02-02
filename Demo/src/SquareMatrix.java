public class SquareMatrix {

    public static void main(String[] args){
        int [][] matrix= new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");

            }
            System.out.println();

        }
    }

}
