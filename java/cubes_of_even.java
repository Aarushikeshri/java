public class cubes_of_even {

        public static void main(String[]args){
            int num=2;
            int sum =0;
            int i=2;
            while(i<=num){
                sum=sum+i*i*i;
                i=i+2;
            }
            System.out.print("Sum of cubes of even numbers: "+sum);
        }
    }

