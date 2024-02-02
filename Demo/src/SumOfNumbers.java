public class SumOfNumbers {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i < args.length; i++) {
            String num = args[i];
            sum = sum + Integer.parseInt(num);

        }
        System.out.println(sum);
    }
}
