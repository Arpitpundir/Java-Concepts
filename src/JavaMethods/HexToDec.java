package JavaMethods;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class HexToDec {
    public static void convertHexaToDecimalNumber(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number");
        String hex = input.nextLine();
        hex = hex.toUpperCase();

        int result = 0;
        int power = 1;
        for(int i=hex.length()-1;i>=0;i--) {
            result += power * (convertHexCharToDecimal(hex.charAt(i)));
            power *= 16;
        }
        System.out.print("Decimal Value of provided Hexadecimal number is:: ");
        System.out.print(result);
        System.out.println();
    }

    private static int convertHexCharToDecimal(char hex){
        if(hex >= 'A' && hex <= 'F'){
            return 10 + (hex - 'A');
        }else{
            return hex - '0';
        }
    }

}
