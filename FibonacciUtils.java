public class FibonacciUtils {

    public static int evenValuesSum() {
        int firstVal = 1;
        int secondVal = 1;
        int sum = 0;
        int limit = 4000000;

        while (true) {
            int temp = secondVal;
            if ((secondVal += firstVal) > limit) {
                break;
            } else if (secondVal % 2 == 0) {
                sum += secondVal;
            }
            firstVal = temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print(FibonacciUtils.evenValuesSum());
    }
}