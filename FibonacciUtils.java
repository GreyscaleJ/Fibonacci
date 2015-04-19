public class FibonacciUtils {

    public static int evenValuesSum() {
        int previous = 1;
        int next = 1;
        int sum = 0;
        int limit = 4000000;

        while (true) {
            int temp = next;
            if ((next += previous) > limit) {
                break;
            } else if (next % 2 == 0) {
                sum += next;
            }
            previous = temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print(FibonacciUtils.evenValuesSum());
    }
}
