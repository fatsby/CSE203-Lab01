import java.util.ArrayList;
import java.util.Collections;

public class StringRequests {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public StringRequests() {
    }

    public StringRequests(String str) {
        this.str = str;
    }

    public void lengthFinder(){
        System.out.println(str.length());
    }
    public void wordsCounter(){
        int wordsCounter = 0;
        for (char c : str.toCharArray()) {
            if (c != ' '){
                wordsCounter++;
            }
        }
        System.out.println(wordsCounter);

    }

    public void concatenateString(String a){
       System.out.println(str.concat(a));
    }

    public void palindromeCheck(){
        ArrayList<Character> charList = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        ArrayList<Character> duplicatedList = new ArrayList<>(charList);
        Collections.reverse(charList);
        if (charList.equals(duplicatedList)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

}
