
/**
 * Information of the bowler
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bowler
{
    private double firstScore;
    private double secondScore;
    private double thirdScore;
    private double ageofbowler;
    private String fullNameOfBowler ;
    private double average;
    private double aver;

    
   
    public bowler(double score1,double score2,double score3,double age,String full_name)
    {
        firstScore=score1;
        secondScore=score2;
        thirdScore=score3;
        ageofbowler=age;
        fullNameOfBowler=full_name;

        average=(firstScore+secondScore+thirdScore)/3;
    }
    public bowler(){
      firstScore=0;
      secondScore=0;
      thirdScore=0;
      ageofbowler=0;
      fullNameOfBowler=null;
    }
    public double getaverage()
    {
        return average;   
    }

    public String getnameofbowler()
    {
        return fullNameOfBowler;
    }

    public  double getscore1()
    {
        return firstScore; 
    }

    public double getscore2()
    {
        return secondScore;  
    }

    public double getscore3()
    {
        return thirdScore;  
    }

public void setscore1(double score1){
    firstScore=score1;
    average=(firstScore+secondScore+thirdScore)/3;
    
}
public void setscore2(double score2){
    secondScore=score2;
    average=calAverage(firstScore,secondScore,thirdScore);
    
}
public void setscore3(double score3){
  thirdScore=score3;
  average=calAverage(firstScore,secondScore,thirdScore);
}
public double calAverage(double firstScore,double secondScore,double thirdScore)
{
    
    aver=(firstScore+secondScore+thirdScore)/3;
    
    return aver;
}
}


