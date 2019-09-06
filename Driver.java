import java.util.Scanner;


/**
 * This class creates an instance of tip class
 * It allows the user to enter values formeals and percents
 * and prints the tip amount
 * 
 * @author Flora Kunjumon
 * @version 5/24/2019
 */
public class Driver
{
    public static void main (String []args)
    {
        Tip myMeal;//its not a field like double ,int, its only a reference variable 
        Scanner input;
        double mealCost;
        double percent;
        char goAgain;
        goAgain='y';
        
        input=new Scanner (System.in);
            myMeal=new Tip(); 
            
            goAgain='y';
        while (goAgain=='y')
        {
            
            
            System.out.print("Enter the cost of the meal: ");
            mealCost=input.nextDouble();
            myMeal.setPriceOfMeal(mealCost);
              
            System.out.println("Enter the perent for tip: ");
            percent=input.nextDouble();
            myMeal.setTipPercent(percent);
            
            
            
            System.out.println("The amount you should leave is "+myMeal.getTipAmount());
            System.out.print("Enter a 'y' to go again: ");
            goAgain=input.next().charAt(0);//to read a single character
            
    }//end of while loop 
    
   
}
}
