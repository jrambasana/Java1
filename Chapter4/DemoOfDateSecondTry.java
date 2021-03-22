package Chapter4;
public class DemoOfDateSecondTry
{
   public static void main(String[] args)
   {
        DateSecondTry date = new DateSecondTry(  );
        date.readInput( );

        System.out.println("Day: " + date.getDay() 
                        + " Month: " + date.getMonth()
                        + " Year: " + date.getYear());
        System.out.println(date.getDay()+ " / " + date.getMonth()
                        + " / " + date.getYear());    
    }
}
