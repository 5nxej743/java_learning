import java.util.Scanner;
public class oneFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time [] = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
        String names [] =  {"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
        int temp;
        String temp1;
        for (int i = 1; i< time.length; i++) {
            for (int j = i; j >0; j--) {
                if (time[j] < time [j-1]) {
                    temp = time[j];
                    temp1 = names[j];
                    time[j] = time[j-1];
                    names[j] = names[j-1];
                    time[j-1] = temp;
                    names[j-1] = temp1;
                }
            }
        }
        System.out.println("Выберите опцию:");
        System.out.println("1 - Отсортировать бегунов");
        System.out.println("2 - Показать имя бегуна занявшего # место");
        int option = scanner.nextInt();
        if (option == 1){
            for (int i = 0; i< time.length; i++) {
                System.out.println(names[i] + " - " + time[i]);
            }
        } else if (option == 2) {
            System.out.println("Введите номер места (1-16)");
            int place = scanner.nextInt();
            System.out.println(names[place-1] + " - " + time[place-1]);
        }
    }
}
