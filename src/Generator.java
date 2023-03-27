import java.util.Random;
import java.util.Scanner;

public class Generator {
    final char[] source = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
    final Scanner scanner = new Scanner(System.in);
    final Random random = new Random();

    public void GeneratorPass() {
        System.out.print("Введите кол-во символов для пароля: ");
        int cout = 0;
        if (scanner.hasNextInt()) {
            cout = scanner.nextInt();
        }
        else System.out.println("Введите число");
        char[] pass = new char[cout];
        if(pass.length >= 8 &&  pass.length <= 32) {
            for (int i = 0; i < pass.length; i++) {
                pass[i] = source[random.nextInt(source.length)];
            }
                System.out.println("Ваш пароль: ");
                System.out.println(pass);
        }
        else {
            System.out.println("Мало символов или слишком много. Поробуйте еще раз вести число от 8 до 32");
        }
    }
}

