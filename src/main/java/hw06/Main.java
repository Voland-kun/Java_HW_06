package hw06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("laptop1", 8, 1000, "Windows", "black");
        Laptop laptop2 = new Laptop("laptop2", 12, 1000, "Windows", "black");
        Laptop laptop3 = new Laptop("laptop3", 6, 128, "Linux", "red");
        Laptop laptop4 = new Laptop("laptop4", 10, 512, "Windows", "white");
        Laptop laptop5 = new Laptop("laptop5", 8, 256, "MacOS", "silver");
        Laptop laptop6 = new Laptop("laptop6", 8, 512, "Windows", "black");
        Laptop laptop7 = new Laptop("laptop7", 16, 2000, "Windows", "white");
        Laptop laptop8 = new Laptop("laptop8", 8, 500, "Windows", "red");
        Laptop laptop9 = new Laptop("laptop9", 16, 500, "MacOS", "silver");
        Laptop laptop10 = new Laptop("laptop10", 8, 128, "MacOS", "silver");


        ArrayList<Laptop> catalog = new ArrayList(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9, laptop10));
        Scanner sc = new Scanner(System.in);
        int taskChoice;
        while (true) {
            System.out.println("Для выбора задачи действия введите номер\n 1 - вывод всех моделей \n 2 - подбор по цвету \n 3 - побор по объему оперативной памяти");
            try {
                taskChoice = Integer.parseInt(sc.next());
                if (taskChoice == 1) {
                    for (Laptop laptop : catalog) {
                        laptop.printInfo();
                    }
                    break;
                }
                if (taskChoice == 2) {
                    colorSearch(catalog);
                    break;
                }
                if (taskChoice == 3) {
                    ramSearch(catalog);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите корректный номер задачи");
            }
        }
    }

    public static void colorSearch(ArrayList<Laptop> arrlist) {
        while (true) {
            Scanner scanColor = new Scanner(System.in);
            System.out.println("Для выбора цвета введите red, black, silver или white");
            String colorChoice = scanColor.nextLine();
            if (colorChoice.equals("red") || colorChoice.equals("black") || colorChoice.equals("silver") || colorChoice.equals("white")) {
                for (Laptop laptop : arrlist) {
                    if (colorChoice.equals(laptop.getColor())) {
                        laptop.printInfo();
                    }
                }
                break;
            } else {
                System.out.println("Введите корректный цвет");
            }
        }
    }

    public static void ramSearch(ArrayList<Laptop> arrlist) {
        while (true) {
            Scanner scanRam = new Scanner(System.in);
            System.out.println("Введите минимальный объем оперативной памяти в Гб");
            try {
                 int ramChoice = Integer.parseInt(scanRam.next());
                 for (Laptop laptop : arrlist) {
                    if (ramChoice <= (laptop.getRam())) {
                        laptop.printInfo();
                    }
                }
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Введите корректное значение");
            }
        }
    }
}