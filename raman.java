import java.util.Scanner;
import java.util.Random;



public class raman{
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Sissors Game ");
        System.out.println("Select Your opiton:");
        System.out.println("1.Rock/n");
        System.out.println("2.Paper");
        System.out.println("3.Siccors");
        
        Scanner hag = new Scanner(System.in);
        System.out.println("Enter your option: ");
        int a = hag.nextInt();

        Random ram = new Random();
        int b = ram.nextInt(1,3);

        if(a==b){
            System.out.println("It's a Draw");
        }
        else if(a==1 && b==2){
            System.out.println("You loose");
        }
        else if(a==2 && b==3){
            System.out.println("You loose");

        }
        else if(a==1 && b==3){
            System.out.println("Youse loose");
        }
        else{
            System.out.println("You Win");
        }

        System.out.println("Your move=" +a);
        System.out.println("Compters move=" +b);


            
    }
}
