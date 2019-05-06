import java.util.Scanner;

public class oneOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String sentence = scanner.nextLine();
        System.out.println("Что сделать? Введите номер операции:");
        System.out.println("1 - Вывести предложение в обратном порядке");
        System.out.println("2 - Разбить предложение на слова");
        System.out.println("3 - Заменить все пробелы на *");
        System.out.println("4 - Вывести в UpperCase");
        System.out.println("5 - Вывести с 5 по 10 символ");
        int numberOfOption = scanner.nextInt();
        int lengthOfString = sentence.length();
        int number = lengthOfString - 1;
        if (numberOfOption == 1) {
            char charArray[] = new char[lengthOfString];
            for (int i = 0; i < lengthOfString; i++) {
                char letterChar = sentence.charAt(i);
                charArray[number] = letterChar;
                number = number - 1;
            }
            System.out.println(charArray);
        } else if (numberOfOption == 2) {
            int amountOfSpaces = sentence.length() - sentence.replace(" ", "").length();
            int intArray[] = new int[amountOfSpaces];
            int index = 0;
            for (int i = 0; i < lengthOfString; i++) {
                char letterChar = sentence.charAt(i);
                if (' ' == letterChar) {
                    intArray[index] = i;
                    index = index + 1;
                }
            }
            char charArray1[] = new char[lengthOfString];
            for (int i = 0; i< amountOfSpaces; i++) {
                if (i == 0) {
                    String firstWord = sentence.substring(i, intArray[i]);
                    String wordMiddle = sentence.substring(intArray[i]+1,intArray[i+1]);
                    System.out.println(firstWord);
                    System.out.println(wordMiddle);
                } else if (i == amountOfSpaces -1){
                    String wordLast = sentence.substring(intArray[i]+1);
                    System.out.println(wordLast);
                } else {
                    String wordMiddle = sentence.substring(intArray[i]+1,intArray[i+1]);
                    System.out.println(wordMiddle);
                }
            }
        } else if (numberOfOption == 3) {
            System.out.println(sentence.replace(" ", "*"));
        } else if (numberOfOption == 4) {
            System.out.println(sentence.toUpperCase());
        } else if (numberOfOption == 5) {
            System.out.println(sentence.substring(4,9));
        }
    }
}