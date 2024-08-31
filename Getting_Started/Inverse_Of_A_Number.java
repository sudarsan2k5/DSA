import java.util.Scanner;

public class Inverse_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int inverse = 0;

        int originalPosition = 1;
        while(num != 0){
            int originalDigit = num % 10;
            int invertedDight = originalPosition;
            int invertedPlace = originalDigit;

            // Make Change to Inverse using InversePlace and invertedDigit
            inverse = inverse + invertedDight * (int)Math.pow(10, invertedPlace - 1);

            num = num / 10;
            originalPosition++;
        }
        System.out.println(inverse);
    }
}