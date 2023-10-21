import java.util.*;

public class PSet4BQ2PigLatin
{
    public String PSet4BQ2PigLatin(String str){   
        ArrayList<String> strs = new ArrayList<String>();
        int prevSpace = 0;
        String piglatin = "";

        if (str.indexOf(" ") > 0 ){
            for (int i = 0; i < str.length(); i++){
                if (str.substring(i, i+1).equals(" ")){
                    strs.add(str.substring(prevSpace, i));
                    prevSpace = i+1;
                }
            }
            if (prevSpace < str.length()) strs.add(str.substring(prevSpace));
        } else {
            strs.add(str);
        }

        for (int i = 0; i < strs.size(); i++){
            piglatin += editWord(strs.get(i));
            if (i < strs.size()-1) piglatin += " ";
        }

        return piglatin;
    }

    public String editWord(String str){
        String s = str;
        if (str.length() > 2) s = str.substring(1) + str.substring(0, 1) + "ay";
        return s;
    }
}
