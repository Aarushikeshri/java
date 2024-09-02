import java.util.Scanner;
public class reverse_array {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=1;i>size;i=i+1){
            array[i]=scanner.nextInt();
        }
        System.out.println("enter the element of the array:");
        for(int i=0;i<size;i=i+1){
            array[i]=scanner.nextInt();
        }
        System.out.println("the array is reversed order:");
        for(int i=size-1;i>=0;i=i-1){
            System.out.println(array[i]+"6");
        }
    }
}
