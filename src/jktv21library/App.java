package jktv21library;

import java.util.Scanner;

    public class App {
        public void run(){
            Scanner sc = new Scanner(System.in);
            boolean repeat = true;
            do{
                System.out.println("Функции приложения: ");
                System.out.println("0. Закрыть приложение");
                int task = sc.nextInt();
                System.out.println("Выбери номер функции: ");
                sc.nextLine();
                switch (task){
                    case 0:
                        repeat = false;
                        break;
                    default:
                        System.out.println("Выбери номер функции из списка!");
            }
            }while(repeat);
            System.out.println("Пока!");
        }
    
}
