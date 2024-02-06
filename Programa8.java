import java.util.Scanner;

public class Programa8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rawInput = "";        

        int maior = 0, menor = 1000, acima = 0, abaixo = 0;
        int sum = 0, nStudents = 0;
        float media;


        while (true) {
            rawInput = sc.nextLine();
            String[] input = rawInput.split(" ");
            if (input[0].equals("-")) {
                break;
            } 
            int grade = Integer.parseInt(input[1]);

            if (grade > maior)  {
                maior = grade;
            }

            if (grade < menor) {
                menor = grade;
            }

            if (grade >= 700) {
                acima++;
            } else {
                abaixo++;
            }
            sum += grade;
            nStudents++;
        }

        media = sum / nStudents;

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + String.format("%.00f", media));
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);

        sc.close();
    }
}