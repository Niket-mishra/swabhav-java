public class Pattern06 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {
            String temp = "" + i ;
            int Sum =0;
            for (int j = 0;j < temp.length(); j++) {
                int num = Integer.parseInt(temp.substring(j, j+1));
                Sum += (num*num*num);

                if (Sum == i) {
                    System.out.println(Sum);
                }


            }

        }
    }
}
