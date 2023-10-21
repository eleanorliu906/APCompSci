
/**
 * Write a description of class PSet4BQ1Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PSet4BQ1Palindrome
{
     public boolean PSet4BQ1Palindrome(String str)
    {
        String nonLetters = ",.:;()[]{} !?@#$%^&*";
        String s = "";
        for (int i = 0; i < str.length(); i++){
            String letter= str.substring(i, i+1);
            if (!nonLetters.contains(letter) && !letter.equals(" ")){
                s += letter;
            }
        }
        s = s.toLowerCase();
        for(int i = 0; i < s.length()/2; i++){
            String f = s.substring(i, i+1);
            String l = s.substring(s.length()-i-1, s.length()-i);
            
            if (!f.equals(l))return false;
        }
        return true;
    }
}
