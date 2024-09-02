public class height_based {
    public static void main(String[] args){
        int height=163;
        if(height<150){
            System.out.println("dwarf");
        }else if(height >= 150 && height <= 165){
            System.out.println("average height");
        }else if(height>165){
            System.out.println("tall");
        }

    }
}
