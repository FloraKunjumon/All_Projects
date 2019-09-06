
/**
 * This class holds data and calculations for a tip at a restaurent or other similar service
 *
 * @author Flora Kunjumon
 * @version 5/22/2019
 */
public class Tip
{
    //fields
  private double priceOfMeal;
  private double tipPercent;
  private double tipAmount;
  
  public Tip(double inPrice,double inPercent){
      //double priceOfMeal and double inPercent are parameters
      priceOfMeal=inPrice;
      tipPercent=inPercent/100;
      tipAmount=priceOfMeal*tipPercent;
      
    }
    public Tip()
    {
        priceOfMeal=0;
        tipPercent=0;
        tipAmount=0;
    }
  
  public void setPriceOfMeal(double inPrice)
  {
  if(inPrice>0)
  priceOfMeal=inPrice;
  tipAmount=priceOfMeal*tipPercent;
  
}

public double getPriceOfMeal()
{
  return priceOfMeal;  
}

public double getTipPercent()
{
return tipPercent;    
}

public double getTipAmount()
{
    return tipAmount;
}
public void setTipPercent(double inPercent)
  {
  if(inPercent>0)
  tipPercent=inPercent/100;
  tipAmount=priceOfMeal*tipPercent;
}
}