package inheritance;


public class HourlyEmployee extends Employee{
    public HourlyEmployee(String lastname, String firstname, String employeeID, String dataOfHire, double rateOfPay){
       super(lastname, firstname, employeeID, dataOfHire, rateOfPay);
  }
    
    public void displayRateOfPay(){
        System.out.println("You are paid "+this.rateOfPay+" per hour.");
    }
}
