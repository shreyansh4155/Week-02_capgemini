import java.util.Scanner;

public class PalindromeChecker {
    String text;


    public PalindromeChecker(String text){
        this.text=text;
    }

    public boolean isPalindrome(){
        int start=0;
        int end = text.length()-1;
        while(start < end){
            if (text.charAt(start) == text.charAt(end)){
                return true;
            }
            start++;
            end--;


        }
        return false;
    }
    public void display(){
        System.out.println(isPalindrome());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String str = scn.nextLine();

        PalindromeChecker obj = new PalindromeChecker(str);
        obj.display();
    }
}
