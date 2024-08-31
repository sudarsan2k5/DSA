import java.util.Scanner;

public class Reverse_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while(n != 0){
            int num = n % 10;
                n = n / 10;
            System.out.println(num);
        }
        
    }
}
