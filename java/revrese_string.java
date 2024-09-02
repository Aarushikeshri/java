public class revrese_string {
    public static void main(String[]args){
        String originalStr="aarushi";
        String reversedStr="";
        System.out.println("Original string: " + originalStr);
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}

