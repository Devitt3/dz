import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите свой возраст: ");
        int age = in.nextInt();
        System.out.print("Введите свой рост: ");
        float weight = in.nextFloat();

        System.out.printf("Name: %s Age: %d Weight: %.1f \n", name, age, weight);
    }
}


