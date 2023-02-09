package inheritance;


public class EmployeeRunner {
    
    public static void main(String [] args){
    Employee e1 = new Employee("Castro","Jem","202013","Jan 02, 2009", 45000);
    HourlyEmployee e2 = new HourlyEmployee("Rosas","Feliz","201221","Feb 3, 2011", 500);
    ContractEmployee e3 = new ContractEmployee("Dela Fuente","Roger","2033333","Apr 6, 2004", 12200);
    
    e1.displayRateOfPay();
    e2.displayRateOfPay();
    e3.displayRateOfPay();
    
    }
}
