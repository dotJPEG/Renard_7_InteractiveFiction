/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renard_7_tbagame;

import java.util.Random;
import java.util.Scanner;
//import static renard_7_guessinggameright.Renard_7_GuessingGameRight.name;

/**
 *
 * @author dotJPEG
 */
public class GuessGameClass {
    
    public static Scanner name = new Scanner(System.in);
public static Scanner number = new Scanner(System.in);        
public static Random rand = new Random();
public static Scanner YN = new Scanner(System.in);    
    
 public static void gamecode(){   
    System.out.println("What is your name?");

 String a_name = name.nextLine();
        System.out.println("Hello " + a_name);
        System.out.println("Would you like to play a game? (Yes/No)");
        String yn = YN.nextLine();
            if("Yes".equals(yn)){
                System.out.println("Great! Okay " + a_name + " strike a number and hit enter when you are ready");
                    int a_number = number.nextInt();
                    int magicnumber = rand.nextInt(10);
                    boolean right = false;
                    int counter = 5;
                        while(right == false && counter > 0){
                                System.out.println("guess a number between 1 and 10, you have " + counter + " tries to do so");
                                a_number = number.nextInt();
                        if(a_number == magicnumber){
                            System.out.println("Good job! You won!");
                            right = true;
                            break;
                            //right = true;
                        }else if(a_number < magicnumber){
                            System.out.println("Oops! That number is to low, try again!");
                            counter--;
                            System.out.println("You have " + counter + " tries left");
                        }else if(a_number>magicnumber){
                            System.out.println("Oops! That number is to high, try again!");
                            counter--;
                            System.out.println("You have " + counter + " tries left");

                        }
                        }
                        if(counter == 0){
                            System.out.println("Welp, looks like you've ran out of tries, consider not being so trash m8");
                        }
            }               
}
}