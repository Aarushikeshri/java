public class leap_year {
    public static void main(String[] args){
        int year=2020;
        if( year % 4 == 0 && year % 100 !=0){
            System.out.println("year is leap year");
        }else{
            System.out.println("year is not a leap year");
        }
    }
}
