import java.util.Scanner;

public class lessonOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        //String equationWoutSpaces = equation.replaceAll(" ", "");
        int indexOf1stSpace = equation.indexOf(" "); //index of 1st space
        String firstStr = equation.substring(0, indexOf1stSpace); //first number in string
        int indexOf2ndSpace = equation.indexOf(" ", (indexOf1stSpace + 1)); //index of 2nd space
        String secondStr = equation.substring(indexOf1stSpace, indexOf2ndSpace); // 2nd number in string
        int indexOf3rdSpace = equation.indexOf(" ", (indexOf2ndSpace + 1));
        String thirdStr = equation.substring(indexOf2ndSpace, indexOf3rdSpace);
        int indexOf4thSpace = equation.indexOf(" ", (indexOf3rdSpace + 1));
        String fourthStr = equation.substring(indexOf3rdSpace, (indexOf4thSpace + 1));
        String fifthString = equation.substring(indexOf4thSpace);
        int indexOfX = equation.indexOf("x");
        int x;
        if ("x".equals(firstStr)) {
            int thirdNumber = Integer.parseInt(thirdStr);
            int fifthnumber = Integer.parseInt(fifthString);
            if ("=".equals(secondStr) && "-".equals(fourthStr)) {
                x = thirdNumber - fifthnumber;
                System.out.println(x);
            } else if ("=".equals(secondStr) && "+".equals(fourthStr)) {
                x = thirdNumber + fifthnumber;
                System.out.println(x);
            } else if ("-".equals(secondStr)) {
                x = thirdNumber + fifthnumber;
                System.out.println(x);
            } else {
                x = fifthnumber - thirdNumber;
                System.out.println(x);
            }
        } else if ("x".equals(thirdStr)) {
            int firstNumber = Integer.parseInt(firstStr);
            int fifthnumber = Integer.parseInt(fifthString);
            if ("=".equals(secondStr) && "-".equals(fourthStr)) {
                x = firstNumber + fifthnumber;
                System.out.println(x);
            } else if ("=".equals(secondStr) && "+".equals(fourthStr)) {
                x = firstNumber - fifthnumber;
                System.out.println(x);
            } else if ("-".equals(secondStr)) {
                x = firstNumber - fifthnumber;
                System.out.println(x);
            } else {
                x = fifthnumber - firstNumber;
                System.out.println(fifthnumber);
                System.out.println(firstNumber);
                System.out.println(x);
            }
        } else {
            int firstNumber = Integer.parseInt(firstStr);
            int thirdNumber = Integer.parseInt(thirdStr);
            if ("=".equals(secondStr) && "-".equals(fourthStr)) {
                x = firstNumber - thirdNumber;
               System.out.println(x);
            } else if ("=".equals(secondStr) && "+".equals(fourthStr)) {
                x = firstNumber - thirdNumber;
               System.out.println(x);
            } else if ("-".equals(secondStr)) {
                x = firstNumber - thirdNumber;
               System.out.println(x);
            } else {
                x = thirdNumber + firstNumber;
               System.out.println(x);
            }
        }
    }
}