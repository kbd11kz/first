package com.company;
import java.io.*;
import java.util.Scanner;
public class task3 {
    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
    public static void main(String[] args) {
        System.out.println(1 + 2 * (3 + 4 * 5 + 6 * 7 + 8 * 9 + 10 * 11 + 12 * 13 + 14) + 15);
        System.out.println("APR 20 2000");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Протос" + i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Зерг" + i);
        }
        for (int i = 1; i <= 12; i++) {
            System.out.println("Терран" + i);
        }

        int out = 1;
        for (int i = 1; i <= 10; i++) {
            out *= i;
        }
        System.out.println(out);

        int list[] = new int[10];
        int res=0;
        for (int i=1;i<=10;i++){
            res+=i;
            list[i-1]=res;
        }
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }



        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo indigo = new Indigo();
        Violet violet = new Violet();

        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";

        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(b+a+c);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        System.out.println(c+b+a);

        for(int i=1;i<=10;i++){
            System.out.println(" ");
            for (int t=1;t<=10;t++){
                System.out.print(i*t+" ");
            }
        }

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\n" +
                "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

        System.out.println("日本語");

        Scanner scanner = new Scanner(System.in);
        /*
        String name = scanner.nextLine();
        int num = scanner.nextInt();
        System.out.println(name + " захватит мир через " + num + " лет. Му-ха-ха!");*/

        /*
        String name2 = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(name2+" получает "+ num1 + " через " + num2 + " лет.");
         */
        String name3 = scanner.nextLine();
        System.out.println(name3+" зарабатывает $5,000. Ха-ха-ха!");

        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();
        System.out.println(name4+" проспонсировал "+ name5+", и она стала известной певицей.");

        String name6 = scanner.nextLine();
        String name7 = scanner.nextLine();
        String name8 = scanner.nextLine();
        System.out.println(name6 + name7 + name8 +"= Чистая любовь, да-да!");











    }


}
