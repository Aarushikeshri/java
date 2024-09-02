public class product_of_no {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        int product = 1;

        while (start <= end) {
            product *= start;
            start++;
        }

        System.out.println("The product of numbers from 1 to 5 is: " + product);
    }
}