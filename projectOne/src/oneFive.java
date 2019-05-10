import java.util.Arrays;
import java.util.Scanner;
public class oneFive {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = "константин";
            String lastName = "прадед";
            String nameArray[] = {"к","о","н","с","т","а","н","т","и","н"};
            String nameArrayEmpty[] = {"*","*","*","*","*","*","*","*","*","*"};
            String lastNameArray[] = {"п","р","а","д","е","д"};
            String lastNameEmptyArray[] = {"*","*","*","*","*","*"};
            String usedLettersArray [] = new String [100];
            int nextIndex = 0;
        for (int j = 0; j < 100; j++) {
            if (Arrays.equals(nameArray,nameArrayEmpty) && Arrays.equals(lastNameArray,lastNameEmptyArray)) {
                System.out.println("Игра окончена!");
                break;
            }
            System.out.println("Введите слово или букву чтобы угадать имя и фамилию");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(name.toLowerCase())) {
                nameArrayEmpty = nameArray;
                System.out.println("Вы угадали имя!");
                System.out.println("Ваш результат: " + name + " " + Arrays.toString(lastNameEmptyArray).replace("[","").replace("]","").replace(",","").replace(" ",""));
            } else if (input.toLowerCase().equals(lastName.toLowerCase())) {
                lastNameEmptyArray = lastNameArray;
                System.out.println("Вы угадали фамилию!");
                System.out.println("Ваш результат: " + Arrays.toString(nameArrayEmpty).replace("[","").replace("]","").replace(",","").replace(" ","") + " " + lastName);
            } else if (input.length() == 1) {
                if (Arrays.asList(usedLettersArray).contains(input.toLowerCase())){
                    System.out.println("Вы уже вводили этот символ. Попробуйте угадать с другим.");
                    continue;
                }
                boolean containsName = Arrays.asList(nameArray).contains(input.toLowerCase());
                boolean containsLastName = Arrays.asList(lastNameArray).contains(input.toLowerCase());
                if (containsName && containsLastName) {
                    System.out.println("Буква угадана!");
                    for (int i = 0; i < nameArray.length; i++) {
                        if (nameArray[i].equals(input)) {
                            nameArrayEmpty[i] = input;
                            if (!Arrays.asList(usedLettersArray).contains(input.toLowerCase())){
                                usedLettersArray[nextIndex] = input;
                                ++nextIndex;
                            }
                        }
                    }
                    for (int i = 0; i < lastNameArray.length; i++) {
                        if (lastNameArray[i].equals(input)) {
                            lastNameEmptyArray[i] = input;
                        }
                    }
                } else if (containsName) {
                    System.out.println("Буква угадана!");
                    for (int i = 0; i < nameArray.length; i++) {
                        if (nameArray[i].equals(input)) {
                            nameArrayEmpty[i] = input;
                            if (!Arrays.asList(usedLettersArray).contains(input.toLowerCase())){
                                usedLettersArray[nextIndex] = input;
                                ++nextIndex;
                            }
                        }
                    }
                } else if (containsLastName) {
                    System.out.println("Буква угадана!");
                    for (int i = 0; i < lastNameArray.length; i++) {
                        if (lastNameArray[i].equals(input)) {
                            lastNameEmptyArray[i] = input;
                            if (!Arrays.asList(usedLettersArray).contains(input.toLowerCase())){
                                usedLettersArray[nextIndex] = input;
                                ++nextIndex;
                            }
                        }
                    }
                } else {
                    System.out.println("Вы не угадали!");
                    if (!Arrays.asList(usedLettersArray).contains(input.toLowerCase())){
                        usedLettersArray[nextIndex] = input;
                        ++nextIndex;
                    }
                }
                System.out.println("Ваш результат: " + Arrays.toString(nameArrayEmpty).replace("[","").replace("]","").replace(",","").replace(" ","") + " " + Arrays.toString(lastNameEmptyArray).replace("[","").replace("]","").replace(",","").replace(" ",""));
            } else {
                System.out.println("Вы не угадали!");
                System.out.println("Ваш результат: " + Arrays.toString(nameArrayEmpty).replace("[","").replace("]","").replace(",","").replace(" ","") + " " + Arrays.toString(lastNameEmptyArray).replace("[","").replace("]","").replace(",","").replace(" ",""));
            }
        }
    }
}
