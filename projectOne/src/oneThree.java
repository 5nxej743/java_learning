import java.util.Scanner;
public class oneThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну стороны ромба");
        int sidelength = scanner.nextInt();
        for (int i = 1; i <= sidelength*2; i++) {
            int index = 0;
            char array [] = new char[i];
            array [index] = '*';
            index = index +1;
            System.out.println(array);
        }
    }
}
