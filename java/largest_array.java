import java.util.Scanner;
public class largest_array {
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
        int largest = array[0];
        for (i=1;i<size;i=i+1){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("the lagest number in the array is:"+largest);
    }
}