import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        String rInput = sc.nextLine();
        String[] input = rInput.split(" ");

        int s = input.length;

        for (int i = 0; i < s; ++i) {
            soma += Integer.parseInt(input[i]);
        }

        float media = soma / s;
        boolean first = true;
        for (int i = 0; i < s; ++i) {
            if (Integer.parseInt(input[i]) > media) {
                if (first) {
                    first = false;
                    System.out.print(input[i]);
                } else {
                    System.out.print(" " + input[i]);
                }
            }
        }

        System.out.println();

    }    
}
