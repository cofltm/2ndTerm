import java.util.Scanner;

public class Regex_Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        //MM-DD-YYYY
        String pattern = "((0[1-9])|(1[12]))/((0[1-9])|([12]\\d)|(3[1])/(\\d))";
        if(input.matches(pattern)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
