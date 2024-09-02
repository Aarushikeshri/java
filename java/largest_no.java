public class largest_no {
    public static void main(String[] args){
        int num1=12;
        int num2=25;
        int num3=52;

            if(num1>num2 && num1>num3){
                System.out.println("the first number is greater among three");
            }else if(num2>num3 && num2>num1){
                System.out.println("the second number is greater among three");
            }else if(num3>num1 && num3>num2){
                System.out.println("the third number is greater among three");
            }
    }
}
