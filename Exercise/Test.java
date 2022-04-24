package Exercise;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        // Create a name
        Name name = new Name("John", 'D', "Smith");
    
        // Create an address
        Address address = new Address("100 Main Street", "Savannah", "GA", "31419");
    
        // Create a loan
        Loan loan = new Loan(5.5, 15, 250000);
    
        // Create a borrower
        Borrower borrower = new Borrower(name, address);
        borrower.setLoan(loan);
    
        // Display loan information
        JOptionPane.showMessageDialog(null, borrower.toString());
    }
    
}
