/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jakobtollefsonlab1;
import java.util.*;
/**
 *
 * @author jakobtollefson
 */
public class Jakobtollefsonlab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyboard=new Scanner(System.in);
     //ask user for name
     System.out.println("What is your name?");
     String name = keyboard.nextLine();
     //ask user for height and weight and convert height to inches
     System.out.println("what is your height in feet?");
     double heightInFeet=keyboard.nextDouble(); 
     
     System.out.println("what are the remaining inches in your height?");
     double remainingInches=keyboard.nextDouble();
     
     double heightInInches= heightInFeet*12+remainingInches;
     
     System.out.println("What is your weight?");
     
     int weight= keyboard.nextInt();
     //tell the user their BMI
     System.out.println(name+" your height is "+ heightInInches+" your weight is "+weight);
     double body= heightInInches*heightInInches;
     double bodymass= weight/body;
     double bmi=703*bodymass;
     System.out.println(name+" your BMI is "+bmi);
      //tell the user their BMI category       
    if(bmi<19)
            
        System.out.println("Your BMI is in the unerweight category.");
    else if(bmi<25)
        System.out.println("your BMI is in the healthy category.");
    else if(bmi<30)
        System.out.println("your BMI is in the overweight category.");
    else 
        System.out.println("your BMI is in the obese category.");
     
     
    }
    
}
