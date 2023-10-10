import java.util.Scanner;

/**
 * Write a description of class ProblemSet3B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemSet3B
{
    public static void main(String[] args){
        boolean run = true;
        // The program will keep running so you can test it multiple times, if you want to stop, type "S" and the program will stop.
        
        while (run) {
            System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
            Scanner sc = new Scanner(System.in);
            String humanResponse = sc.nextLine();
            
            if (humanResponse.equals("S")) run = false;

            int h = 0;
            int c = 0;

            int i = humanResponse.lastIndexOf(" ");
            String humanChoice = humanResponse.substring(i+1).toLowerCase();
            // System.out.println(humanChoice);

            if (humanChoice.equals("rock")) h = 0;
            else if (humanChoice.equals("crossblades")) h = 1;
            else if (humanChoice.equals("paper")) h=2;
            else h=3;

            if (humanResponse.length() >= 50) {
                c = (int) Math.random()*3;
            } else {
                if (h==0) c=2;
                else c = h-1;
            }
            //System.out.println("h: " + h + " c: " + c);
            response(c);
            determine(h, c);
        }
    }

    public static void response(int r){
        if (r==0) System.out.println("Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course: ROCK!");
        else if (r==1) System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose CROSSBLADES!");
        else if (r==2) System.out.println("HAHAHAHA. I pick PAPER. PAPER!!!!!!!!!");
    }

    public static void determine(int hum, int cp){
        //System.out.println("h: " + hum + " c: " + cp);
        
        if (hum==3) System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful! \nAs I predicted, I have won this battle. The kingdom is MINE!");
        else if (hum==cp) System.out.println("Unbelievable! We have tied! *Eye twitches*");
        else if (hum<cp && hum!= 0 || hum==2 && cp==0) System.out.println("Oh no! I have lost...");
        else if (cp<hum || hum==0 && cp==2) System.out.println("As I predicted, I have won this battle. The kingdom is MINE!");
    }
}
