public class fibonacci_series  {
    public static void main(String[] args) {
        int count = 10;
        int first = 0;
        int second = 1;

        System.out.println("The first " + count + " Fibonacci numbers are:");

        int i = 0;
        while (i < count) {
            if (i == 0) {
                System.out.print(first + " ");
            } else if (i == 1) {
                System.out.print(second + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
            i++;
        }
    }
}

