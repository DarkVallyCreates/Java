import java.util.Random;
import java.util.Scanner;
//import java.util.concurrent.locks.ReentrantLock;
public class RPS {
    public static void main(String[] args) {
        System.out.println("Enter your input from Stone, Paper or Scissor");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int a = rd.nextInt(1,3);
        String game = sc.next();
        //System.out.println("Enter your input from Stone, Paper or Scissor");
        /*Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int a = rd.nextInt(1,3);
        String game = sc.next();*/

        switch (game) {
            case "Stone" -> {
                if (a == 2)
                    System.out.println("You have Lost");
                else if (a==1)
                    System.out.println("You have drawn");
                else
                    System.out.println("You have won");
            }
            case "Paper" -> {
                if (a == 3)
                    System.out.println("You have Lost");
                else if (a==2)
                    System.out.println("You have drawn");
                else
                    System.out.println("You have won");
            }
            case "Scissor" -> {
                if (a == 1)
                    System.out.println("You have Lost");
                else if (a==3)
                    System.out.println("You have drawn");
                else
                    System.out.println("You have won");
            }
        }
        if (a==1)
            System.out.println("Opponents output is Stone");
        else if (a==2)
            System.out.println("Opponents output is Paper");
        else
            System.out.println("Opponents output is Scissor ");




        }
    }

