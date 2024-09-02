public class quadrant {
    public static void main(String[] args){
        int a=7;
        int b=9;
            if(a>0 && b>0){
                System.out.println("quadrant is first");
            }else if(a>0 && b<0){
                System.out.println("quadrant is second");
            }else if(a<0 && b<0){
                System.out.println("quadrant is third");
            }else if(a<0 && b>0){
                System.out.println("quadrant is thirtd");
            }
    }
}
