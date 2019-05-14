import java.util.Arrays;
import java.util.Scanner;
public class oneThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну стороны ромба");
        int sidelength = scanner.nextInt();
        int arrayIndex = sidelength * 2;
        String starArray[] = new String[arrayIndex];
        for (int a = 0; a <arrayIndex; a++) {
            starArray[a] = "";
        }
        for (int i = 0; i < sidelength; i++) {
            starArray[sidelength -i] = "*";
            starArray [sidelength +i] = "*";
            if (i>0) {
                    starArray[sidelength-i+1] = "";
                    starArray[sidelength+i-1] = "";
                }
            System.out.println(Arrays.toString(starArray).replace("[", "").replace("]", "").replace(",", "").replace(" *","*"));
        }
        for (int j = 1; j<sidelength; j++) {
            starArray[j] = "";
            starArray[j+1] = "*";
            starArray [arrayIndex-j] = "";
            starArray [arrayIndex - j - 1] = "*";
            System.out.println(Arrays.toString(starArray).replace("[", "").replace("]", "").replace(",", "").replace(" *","*"));
        }
    }
}