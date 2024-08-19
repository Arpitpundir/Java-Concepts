package Array;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void analyzeNumbers(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count of input of numbers:: ");
        int count = input.nextInt();
        double[] numbers = new double[count];
        double sum = 0;

        for(int i=0;i<count;i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double avg = sum/count;

        int result = 0;

        for(int i=0;i<count;i++){
            if(numbers[i] > avg){
                result++;
            }
        }

        System.out.println("Count of numbers which are greater than avg "+ avg + " are " + result);
    }
}
