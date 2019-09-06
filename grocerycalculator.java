
/**
 * This program helps to work on the grocery calculator when the user enters the price , the grocerycalcua
 * has to calculate prices per ounce and prices per pounds. 
 *
 */
public class grocerycalculator
{
    
//constants 
private final double OZ_IN_LB=16;
//fields
private double wtInLbS;
private double wtInOz;
private double price;
private double pricePerLb;
private double pricePerOz;

public grocerycalculator()
{
    wtInLbs=wtInOz=price=priceperLb=pricePerOz=0;
}
public grocerycalculator(double inW,String scale;double inPrice)
{
    if(inW.equals("oz")
    {
        wtInOz=inW;
        wtInLb=wtInOz/OZ_IN_LB;
    }
    else


public void setWeight(double amount,String type)
{
    if(type.equals(oz)
    {
        weightInOz=amount;
        wieghtInLbs=weightInLs*Oz_In_Lb;
    }
    priceperLb=price/weightInLbs;
    pricePerOz=price/weightInOz;
    
}
