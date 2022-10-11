import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toLowerCase;


public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        while (true) {
            System.out.println("Доступные операции: \n 1 - Добавить \n 2 - Показать \n " +
                    "3 - Удалить \n 4 - Найти товар \n Выберите операцию: ");

            Scanner scanner = new Scanner(System.in);
            int inputConsole = Integer.parseInt(scanner.nextLine());

            if (inputConsole == 1) {
                System.out.println("Какую покупку хотите добавить? ");
                String buy = scanner.nextLine();
                list.add(buy);

            } else if (inputConsole == 2) {

                System.out.println("Список покупок: ");

                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                System.out.println("\n");
            } else if (inputConsole == 3) {
                System.out.println("Какую покупку хотите удалить? Введите номер или название: ");
                String delete = scanner.nextLine();
                try {
                    System.out.println("Покупка " + list.get(Integer.parseInt(delete) - 1) + " удалена!" + "\n");
                    list.remove(Integer.parseInt(delete) - 1);

                } catch (Exception e) {
                    System.out.println("Покупка " + delete + " удалена!");
                    list.remove(delete);
                }

                System.out.println("Список покупок: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                System.out.println("\n");

            } else if (inputConsole == 4) {
                System.out.println("Введите текст для посика: ");
                String search = scanner.nextLine();

                for (int i = 0; i < list.size(); i++) {
                    String itemLower = list.get(i).toLowerCase();
                    String queryLower = search.toLowerCase();
                    if (itemLower.contains(queryLower)) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }
                System.out.println("\n");
            }
        }
    }
}


