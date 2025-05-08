package Lab8;

import java.util.Scanner;

class BalException extends Throwable{
    public BalException(String msg){
        super(msg);
    }
}
public class Q2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter balance:");
            double bal = sc.nextDouble();
            System.out.print("Enter amount to withdraw: ");
            double wit = sc.nextDouble();
            
            if(bal>wit){
                System.out.println("Remaining Balance: "+(bal-wit));
            }else{
                throw(new BalException ("Insufficient Balance."));
            }
        }
        catch(BalException | Exception ex){
            System.out.println("Exception: "+ex.getMessage());
        }
    }
}
