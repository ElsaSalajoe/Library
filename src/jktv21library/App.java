package jktv21library;

import entity.Book;
import entity.Reader;
import entity.Status;
import java.util.Scanner;

    public class App {
        public void run(){
            Scanner sc = new Scanner(System.in);
            boolean repeat = true;
            do{
                System.out.println("Функции приложения: ");
                System.out.println("0. Закрыть приложение");
                System.out.println("1. Добавить книгу");
                System.out.println("2. Добавить посетителей");
                System.out.println("3. История выдачи книги на руки");
                System.out.println("4. История возврата книги");
                System.out.println("5. Текущий статус книги");
                System.out.println("6. Список книг");
                System.out.println("7. Список авторов");
                
                int task = sc.nextInt();
                System.out.println("Выбери номер функции: ");
                sc.nextLine();
                switch (task){
                    case 0:
                        repeat = false;
                        break;
                    case 1:
                        System.out.println("1. Добавить книгу");
                        Book book = new Book();
                        
                        break;
                    case 2:
                        System.out.println("2. Добавить посетителей");
                        Reader reader = new Reader();
                        break;
                    case 3:
                        System.out.println("3. История выдачи книги на руки");
                        
                        break;
                    case 4:
                        System.out.println("4. История возврата книги");
                        
                        break;
                    case 5:
                        System.out.println("5. Текущий статус книги");
                        Status status = new Status();
                        break;
                    case 6:
                        System.out.println("6. Список книг");
                        break;
                    case 7:
                        System.out.println("7. Список авторов");
                        break;
                    default:
                        System.out.println("Выбери номер функции из списка!");
            }
            }while(repeat);
            System.out.println("До свидания!");
        }
    
}
