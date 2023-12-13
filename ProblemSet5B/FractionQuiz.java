import java.util.Scanner;
import java.lang.Math;

public class FractionQuiz
{
    boolean cont = true;
    int totalRounds = 0;
    int wins = 0;
    Scanner sc = new Scanner(System.in);

    public void game(){
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. If the fraction is a whole number, express it as n/1. Good luck!");
        while (cont){
            generateQuestion();
            totalRounds++;
        }
    }

    public void generateQuestion(){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction ans = new Fraction();
        String operator = "";

        int i = (int) (Math.random() * 4);
        if (i==0) {
            ans = Fraction.add(f1, f2);
            operator = " + ";
        } else if (i==1) {
            ans = Fraction.subtract(f1, f2);
            operator = " - ";
        } else if (i==2) {
            ans = Fraction.multiply(f1, f2);
            operator = " * ";
        } else if (i==3) {
            ans = Fraction.divide(f1, f2);
            operator = " / ";
        }

        System.out.println(f1.toString() + operator + f2.toString() + " = ");
        String input = sc.nextLine();
        input.toLowerCase();
        if (input.equals("quit")) {
            cont = false;
            Fraction wl = new Fraction(wins, totalRounds);
            System.out.println("Your win/loss ratio was " + wins +"/" + totalRounds + " for a score of " + (int) (wl.toDouble()*100) + " percent!");
        } else if (validInput(input)){
            Fraction f = new Fraction(input);
            if (f.equals(ans)){
                System.out.println("Correct!");
                wins++;
            } else {
                System.out.println("Wrong, the answer was " + ans.toString());
            }
        } else {
            System.out.println("Invalid Input");
            System.out.println("Wrong, the answer was " + ans.toString());
        }

    }

    public boolean validInput(String s){
        int idx = s.indexOf("/");
        if (idx == s.lastIndexOf("/") && idx > 0 && idx < s.length()-1){
            return true;
        } 
        return false;
    }
}
