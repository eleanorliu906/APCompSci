
/**
 * Write a description of class MySolutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySolutions
{   
    public void celsiusToFarenheit(){
        double cel = 30.0;
        double far = cel*9.0/5.0 + 32.0;
        System.out.println(cel + "°C = " + far + "°F");
        
    }
    
    public void elapsedTime(){
        int hr = 12;
        int min = 0;
        int sec = 0;
        int secElapsed = hr*3600 + min*60 + sec;
        int secLeft = 24*3600 - secElapsed;
        double percent = secElapsed/86400.0*100.0;
        System.out.print("The current time is " + hr + ":" + min + ":" + sec + ". ");
        System.out.println("It has been " + secElapsed + " since the day began.");
        System.out.println("There are " + secLeft + " seconds left in the day.");
        System.out.println("The day is " + percent + "% done.");
    }
    
    public void secondsToHMS(){
        int secNum = 5000;
        int sec = secNum % 60;
        int hr = secNum/3600;
        int min = (secNum - 3600*hr)/60;
        System.out.println(secNum + " seconds = " + hr + " hours, " + min + " minutes, and " + sec + " seconds.");
    }
}
