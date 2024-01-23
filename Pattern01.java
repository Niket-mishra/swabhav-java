public class Pattern01 {
    public static void main(String[] args) {
        for(int i = 1; 5 >= i; i++){
           for(int j = 5; i <= j; --j){
               System.out.print(j);
           }
           System.out.println();
        }
    }
}
