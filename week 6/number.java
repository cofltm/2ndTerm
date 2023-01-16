import java.util.Scanner;

public class Regex_Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        //(xxx)xxx-xxx
        String pattern = "^[(]([0-9]{3})[)](\\d{3})-\\d{4}";
        if(input.matches(pattern)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
