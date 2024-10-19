import java.util.Scanner;
public class add{
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = x.nextInt();

        System.out.print("Enter Second number: ");
        int b = x.nextInt();

        int sum = a + b ;
       
       System.out.println("The Addition of " +a+ " + " +b+ " is "+sum );
       

    }
}
