import java.util.Scanner;

public class Programa5 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String operator = sc.next();

        if (!operator.equals("/") && 
            !operator.equals("*") &&
            !operator.equals("+") &&
            !operator.equals("-")     
            ) {
                System.out.println("ENTRADA INVALIDA");
                System.exit(0);
            }

        float x1 = sc.nextFloat();
        float x2 = sc.nextFloat();

        float res = 0;

        

        switch(operator.charAt(0)) {
            case '+':
                res = x1 + x2;
                break;
            case '-':
                res = x1 - x2;
                break;
            case '*':
                res = x1 * x2;
                break;
            case '/':
                if (x2 == 0) {
                    System.out.println("ERRO");
                    System.exit(0);
                }
                res = x1 / x2;
                break;
            default:
                System.out.println("ENTRADA INVALIDA");
                System.exit(0);
            }
        System.out.println("RESULTADO: " + res);
        sc.close();

    }
}
