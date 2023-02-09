package inheritance;

public class Employee {
    
    String lastname;
    String firstname;
    String employeeID;
    String dataOfHire;
    double rateOfPay;
    
    public Employee(String lastname, String firstname, String employeeID, String dataOfHire, double rateOfPay){ 
        this.lastname = lastname; // local variables
        this.firstname = firstname;
        this.employeeID = employeeID;
        this.dataOfHire = dataOfHire;
        this.rateOfPay = rateOfPay;
    }
    
    public void work(){
        System.out.println("Working...");
    }
    
    public void displayRateOfPay(){
        System.out.println("You are paid "+this.rateOfPay +" per month.");
    }
}
