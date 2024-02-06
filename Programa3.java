import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        float x1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        
        boolean res = (x1+x2)>=14.0; 

        System.out.println("pass: " + res + "!");
        scanner.close();
    }
}
