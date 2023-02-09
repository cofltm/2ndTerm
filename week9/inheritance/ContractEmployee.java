package inheritance;


public class ContractEmployee extends Employee{
    public ContractEmployee (String lastname, String firstname, String employeeID, String dataOfHire, double rateOfPay){
        super(lastname, firstname, employeeID, dataOfHire, rateOfPay);
    }
    
    public void displayRateOfPay(){
        System.out.println("You are paid "+this.rateOfPay+" per conract.");
    }
    @Override
    public void work(){
        super.work();
        System.out.println("Taking a break...");
    }
}
