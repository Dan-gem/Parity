import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки, является ли оно четным: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a;

        a = x & 1; // 1-ый способ.
        if (a == 1) {
            System.out.println("Число является нечетным");
        } else {
            System.out.println("Число является четным");
        }

//         System.out.println(x % 2 == 0 ? "чётное" : "нечётное"); // 2-ой способ.

    }
}
