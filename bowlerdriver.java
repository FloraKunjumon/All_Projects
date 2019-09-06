
/**
 * Write a description of class bowlerdriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class bowlerdriver
{

    public static void main(String[]args){
        bowler mybowler;
        double s1;
        double s2;
        double s3;
        double ss1;
        double ss2;
        double ss3;
        double average1;
        double average2;
        String b1;
        String b2;
        double av1,av2;
        
        Scanner input=new Scanner(System.in);
        mybowler=new bowler();
        System.out.println("Enter the name of the first bowler");
        b1=input.nextLine();
        
        System.out.println("Enter the first score of bowler 1");
        s1=input.nextInt();
        mybowler.setscore1(s1);
        System.out.println("Enter the second score of bowler 1");
        s2=input.nextInt();
        mybowler.setscore2(s2);
        System.out.println("Enter the third score of bowler 1");
        s3=input.nextInt();
        mybowler.setscore3(s3);
        System.out.println("The average is"+mybowler.getaverage());
        
        average1=(s1+s2+s3)/3;      
       System.out.println("Enter the name of the second bowler");
        b2=input.nextLine();
        
        System.out.println("Enter the first score of bowler 2");
        ss1=input.nextInt();
        mybowler.setscore1(s1);
        System.out.println("Enter the second score of bowler 2");
        ss2=input.nextInt();
        mybowler.setscore2(s2);
        System.out.println("Enter the third score of bowler 2");
        ss3=input.nextInt();
        mybowler.setscore3(s3);
        System.out.println("The average is"+mybowler.getaverage());
        average2=(ss1+ss2+ss3)/3;
        
        if (average1>average2)
        System.out.println("The average of bowler1 is more than bowler2");
        else
        System.out.println("The average of bowler 2 is more then bowler1");
    
        
    }
    

}
