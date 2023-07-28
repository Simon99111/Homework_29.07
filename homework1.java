//Задание 1

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        float input = inputFloat();
        System.out.println(input);
    }

    public static float inputFloat() {
        Scanner sc = new Scanner(System.in);
        float result = 0.0f;
        boolean flag = false;
        while (flag == false) {
             try {
                System.out.print("Введите дробное число: ");
                result = sc.nextFloat();
                flag = true;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                sc.nextLine();
            }
        }
        return result;
    }
}
