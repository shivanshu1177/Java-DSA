//menu driven program
import java.util.Scanner;
public class inputOutput {

    public static void main(String[] args) {
        System.out.println("Enter 1 or 0: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1){
            System.out.println("Enter marks(Out of 100): ");
            int m = sc.nextInt();
            if (m >= 90) {
                System.out.println("This is Good");

            }
            else if(m <= 89 && m>=60){
                System.out.println("This is alse Good");
            }
            else{
                System.out.println("This is good as well");
            }

        }
        else{
            System.out.println("thank you");
        }
        

    
        
    }
}