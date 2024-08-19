package Array;

import java.util.Random;

public class CountLettersInArray {
    public static void main(){
        char[] charArray = createCharArray();
        displayCharArray(charArray);
        displayCounts(charArray);
    }

    private static char[] createCharArray(){
        char[] result = new char[100];
        Random rand = new Random();
        for(int i=0;i<result.length;i++){
            result[i] = (char)(rand.nextInt(26) +'a');
        }
        return result;
    }

    private static void displayCharArray(char[] charArray){
        for(int i=0;i<charArray.length;i++){
            if(i%20 == 0)
            System.out.println();
            else {
                System.out.print(charArray[i]+" ");
            }
        }
    }

    private static void displayCounts(char[] charArray){
        int[] charCount = new int[26];

        for(int i=0;i<charArray.length;i++){
            charCount[charArray[i] - 'a']++;
        }

        System.out.println();
        for(int i=0;i<charCount.length;i++){
            char currChar = (char)(i+'a');
            System.out.println(currChar+": "+charCount[i]);
        }
    }

}
