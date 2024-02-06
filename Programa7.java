import java.util.Scanner;

public class Programa7 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);


        String rInput = sc.nextLine();

        while (rInput != "wally") {
            String[] input = rInput.split(" ");
            if(input[0] == "wally") {
                System.exit(0);
            }
            System.out.println(solve(input));
            rInput = sc.nextLine();
        }
    }

    public static String solve(String[] names) {        
        for(int i = names.length -1; i >= 0; --i) {
            if (names[i].length() == 5) {
                return names[i];
            }
        }

        return "?";
    }
}
