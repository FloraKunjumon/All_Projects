
/**
 * The purpose of the program  is to check whether the client is eligible for loan and what calculating the monthlky payment 
 *
 * @author Flora Kunjumon
 * @version 5/22/2019
 */
import java.util.*;
public class carprice{
public static void main(String[]args){
    Scanner input=new Scanner(System.in);
   char choice;
   System.out.println("Enter the option P or L or D or S or B");
   choice = input.next().charAt(0);
   double base=17500;
   System.out.println("Enter downpayment amount");
   double dp=input.nextDouble();
   System.out.println("Enter annual interest rate of loan");
   double ir=input.nextDouble();
   System.out.println("Enter the length of loan in months");
   double ll=input.nextDouble();
   System.out.println("Enter annual income");
   double ai=input.nextDouble();
    
switch(choice){
case 'B':
System.out.println("The price of car with this feature is "+ (base));
double P=base-dp;
double answer;
answer=Math.pow((1+ir),(-ll));
double MP= P*(ir/(1-answer));
System.out.println(MP);
double MPP=4*MP;
if(ai>=MPP)
System.out.println("You are eligible for loan");
else 
System.out.println("You are not eligible for loan");


break;
case 'P':
System.out.println("The price of car with this feature is "+ (base+1200));
double P1=base-dp;
double answer1;
answer1=Math.pow((1+ir),(-ll));
double MP1= P1*(ir/(1-answer1));

System.out.println(MP1);
double MPP1=4*MP1;
if(ai>=MPP1)
System.out.println("You are eligible for loan");
else 
System.out.println("You are not eligible for loan");

break;
case 'L':
System.out.println("The price of car with this feature is "+ (base+1800));
double P2=base-dp;
double answer2;
answer2=Math.pow((1+ir),(-ll));
double MP2= P2*(ir/(1-answer2));
System.out.println(MP2);
double MPP2=4*MP2;
if(ai>=MPP2)
System.out.println("You are eligible for loan");
else 
System.out.println("You are not eligible for loan");
break;
case 'D':
System.out.println("The price of car with this feature is "+ (base+2500));
double P3=base-dp;
double answer3;
answer3=Math.pow((1+ir),(-ll));
double MP3= P3*(ir/(1-answer3));
System.out.println(MP3);
double MPP3=4*MP3;
if(ai>=MPP3)
System.out.println("You are eligible for loan");
else 
System.out.println("You are not eligible for loan");
break;
case 'S':
System.out.println("The price of car with this feature is "+ (base+3100));
double P4=base-dp;
double answer4;
answer4=Math.pow((1+ir),(-ll));
double MP4= P4*(ir/(1-answer4));
System.out.println(MP4);
double MPP4=4*MP4;
if(ai>=MPP4)
System.out.println("You are eligible for loan");
else 
System.out.println("You are not eligible for loan");
break;
  default:
  System.out.println("Wrong option");
  break;
  /*Ask the user to enter the
 options package (if any)
 down payment amount
 annual interest rate of loan (as a percent ie: user enters 5 for 5% (which is .05)
 length of loan in years
 annual income
This is the formula to compute the monthly payment:
MP = P * (J/(1 – ((1 + J) -N
) ) ) //1 this is a one not an i
 MP = monthly payment (this is the amount you will calculate)
 P = principal, the amount of the loan (car price – down payment)
 I = the annual interest rate (from 1 to 100 percent like 3.8 or 5.5) 
 L = length, the length (in years) of the loan, or at least the length over which the loan is
amortized. (like 5.2 years, 3.5 years…)
  /*System.out.println("Option ‘P’ includes: auto transmission, power windows and locks, stereo sound system.
  Cost: base + 1200
  Option ‘L’ includes: all of the above plus MP3 player, security alarm, cruise control. Cost: base + 1800
  Option ‘D’ includes: all of the above plus deluxe detailing, pin stripes, leather seats, wind bar.
  Cost: base + 2500
  Option ‘S’ includes: all of the above plus seat heaters, Bose speakers, OnStar, steering wheel control of
  music system, chrome rims.
  Cost: base + 3100");
*/
   
   
  
    
    
    
    
}
}
}


