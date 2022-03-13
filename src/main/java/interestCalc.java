
import java.util.Scanner;

public class interestCalc{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        double balance, percent;
        percent = (100 * 0.059);
        
        
        System.out.println("Welcome to the interest calculator!");
        System.out.println("Enter an initial depost: ");
        balance = kb.nextDouble();
        
        balance = balance + (balance * 0.059);
        System.out.println("With a " + percent + "% APR your deposit will be worth $" + balance + " in one year.");
        balance = balance + (balance * 0.059);
        System.out.println("With a " + percent + "% APR your deposit will be worth $" + balance + " in two years.");
       
        
        
    }
    
}
