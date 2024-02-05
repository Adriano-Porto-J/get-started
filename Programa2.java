import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.printf("dobro: %d, triplo: %d", x*2, x*3);
        
        scanner.close();
    }
} 