import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String [] args){
        System.out.println(lengthOfLongestSubstring("abcabcdabca"));
    }

    public static int lengthOfLongestSubstring(String s) {

        String longestSubstring = new String();
        HashMap<String, Integer> stringsAndCount = new HashMap<String, Integer>();

        for(int substringStartingIndex=0, substringEndIndex=substringStartingIndex;substringStartingIndex< s.length() -1 && substringEndIndex < s.length()-1;substringEndIndex++){
            longestSubstring = s.substring(substringStartingIndex,substringEndIndex+1);
            if(!containsDuplicates(longestSubstring)){
                    stringsAndCount.put(longestSubstring, longestSubstring.length());
            }
            else{
                substringStartingIndex++;
            }
        }
        return !stringsAndCount.isEmpty()? Collections.max(stringsAndCount.values()): 0;
    }
    public static boolean containsDuplicates(String s){
        HashMap<Character, Integer> stringHashmap = new HashMap<Character, Integer>();
        for(int i=0;i<s.length(); i++){
            stringHashmap.put(s.charAt(i),1);
        }
        if(s.length() > stringHashmap.size())
            return true;
        return false;

    }
}