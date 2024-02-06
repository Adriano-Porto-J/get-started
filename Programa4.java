import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        boolean increasing = true;
        boolean decreasing = true;

        Scanner scanner = new Scanner(System.in);

        int prev = scanner.nextInt();

        for (int i = 0; i < 3; ++i) {
            int current = scanner.nextInt();
            
            if (current > prev) {
                decreasing = false;
            } else if (current < prev) {
                increasing = false;
            } else {
                decreasing = false;
                increasing = false;
            }
            prev = current;
        }

        if (increasing) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else if (decreasing) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
            
        }

        scanner.close();

    }
}
