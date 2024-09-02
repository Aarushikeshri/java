import java.util.Scanner;

public class average_array {

        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("print the size of the array");
            int size = scanner.nextInt();
            int array[] = new int[size];
            int i;
            System.out.println("enter the element of the array:");
            for (i=0;i<size;i=i+1){
                array[i]= scanner.nextInt();
            }
            int sum=0;
            for (int element:array){

                   sum+=element;

            }
            double average = (double) sum/size;

            System.out.println("the lagest number in the array is:"+average);
        }
}
