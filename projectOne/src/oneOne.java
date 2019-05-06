import java.util.Scanner;

public class oneOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String sentence = scanner.nextLine();
        System.out.println("Что сделать? Введите номер операции:");
        System.out.println("1 - Вывести предложение в обратном порядке");
        System.out.println("2 - Разбить предложение на слова");
        int numberOfOption = scanner.nextInt();
        int lengthOfString = sentence.length();
        int number = lengthOfString - 1;
        if (numberOfOption == 1) {
            char charArray [] = new char[lengthOfString];
            for (int i = 0; i < lengthOfString; i++) {
                char letterChar = sentence.charAt(i);
                charArray[number] = letterChar;
                number = number - 1;
            }
            System.out.println(charArray);
        } else if (numberOfOption == 2) {
            char charArray [] = new char[lengthOfString];
            for (int i = 0; i < lengthOfString; i++) {
                char letterChar = sentence.charAt(i);
                if (' ' != letterChar) {
                    charArray[i] = letterChar;
                } else {
                    System.out.println(charArray);
            }
            }
        }
    }
}
