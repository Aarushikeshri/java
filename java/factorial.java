public class factorial {

        public static void main(String[]args){
            int factorial=1;
            int a=5;
            int i=a;

            while (i>0) {
                factorial=factorial* i;
                i--;
            }
            System.out.print("Factorial is:" + factorial);
        }
    }

