//Задание 4

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        String input = inputString();
        System.out.println(input);
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        String result = "";
        while (result.isEmpty()) {
             try {
                System.out.print("Введите строку: ");
                result = sc.nextLine();
                if (result.isEmpty()){
                    System.out.println("Пустую строку вводить нельзя");
                    // throw new Exception();
                }
            } catch (Exception e) {
                // System.out.println("Пустую строку вводить нельзя");
                sc.nextLine();
            }
        }
        return result;
    }
}

