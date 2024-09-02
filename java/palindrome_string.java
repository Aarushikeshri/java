public class palindrome_string {

        public static void main(String[]args){
            String originalStr="aaruraa";
            String reversedStr="";
            System.out.println("Original string: " + originalStr);
            for (int i = 0; i < originalStr.length(); i++) {
                reversedStr = originalStr.charAt(i) + reversedStr;
            }

            System.out.println("Reversed string: "+ reversedStr);
            if (originalStr==reversedStr){
                System.out.println("the charachter is palindrome");
            }else{
                System.out.println("charachter is not a palindrome");
            }
        }
    }

