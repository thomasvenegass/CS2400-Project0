//Thomas Venegas
//CS 1400
//Asignment 3
//3/1/21

import java.util.Scanner;
public class TaskB
{
    public static void main(String[] args)
    {
        String skier1;
        String skier2;
        String skier3;

        double skier1Time;
        double skier2Time;
        double skier3Time;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the name of the first skier?");
        skier1 = keyboard.nextLine();
        System.out.print("How long did it take this skier to finish the race in seconds?");
        skier1Time = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("What is the name of the second skier?");
        skier2 = keyboard.nextLine();
        System.out.print("How long did it take this skier to finish the race in seconds?");
        skier2Time = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("What is the name of the third skier?");
        skier3 = keyboard.nextLine();
        System.out.print("How long did it take this skier to finish the race in seconds?");
        skier3Time = keyboard.nextDouble();

        if (skier1Time < skier2Time && skier2Time < skier3Time && skier1Time < skier3Time)
        {
            System.out.println ("The skiers finished in this order: " + skier1 + ", " + skier2 + ", " + skier3);
        }
        else if (skier1Time < skier2Time && skier2Time > skier3Time && skier1Time < skier3Time)
        {
            System.out.println ("The skiers finished in this order: " + skier1 + ", " + skier3 + ", " + skier2);
        }
        else if (skier1Time > skier2Time && skier2Time < skier3Time && skier1Time < skier3Time)
        {
            System.out.println ("The skiers finished in this order: " + skier2 + ", " + skier1 + ", " + skier3);
        }
        else if (skier1Time > skier2Time && skier2Time < skier3Time && skier1Time > skier3Time)
        {
            System.out.println ("The skiers finished in this order: " + skier2 + ", " + skier3 + ", " + skier1);
        }
        else if (skier1Time < skier2Time && skier2Time > skier3Time && skier1Time > skier3Time)
        {
            System.out.println ("The skiers finished in this order: " + skier3 + ", " + skier1 + ", " + skier2);
        }
        else
        {
            System.out.println ("The skiers finished in this order: " + skier3 + ", " + skier2 + ", " + skier1);
        }


    }
}