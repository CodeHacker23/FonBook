import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
   private Scanner csr = new Scanner(System.in);
    ArrayList <Contakt> contakts = new ArrayList<>(); // создали колекция от контакта

   public void start() {

       block1: // создали название циклу, благодаря ему мы можем выйти конкретно из этого циукла
       while (true) {
           System.out.println("1 добавить контакт "); //меню
           System.out.println("2 Список контактов ");
           System.out.println("3 Удалить контакт ");
           System.out.println("4 Очистить список ");
           System.out.println("5 Найти контакт ");
           System.out.println("0 выйти из меню ");

           String a = csr.nextLine();

           switch (a) { //кейс

               case "1" -> {
                  creetContakt(); // вызвали метод
               }
               case "2" -> {
                   printContact();
                   

               }
               case "3" -> {
               }
               case "4" -> {
               }
               case "5" -> {
               }
               case "0" -> {
                   break block1;
               }


           }

       }

   }

   public void creetContakt(){ //метод 2

       System.out.println("Введите имя контакта: ");
       String name = csr.nextLine();
       System.out.println("Введите номер контакта: ");
       String namber = csr.nextLine();

       Contakt contakt = new Contakt(name , namber);
       contakts.add(contakt);

   }

   public void printContact(){ //метод3

       for (Contakt contakt : contakts) {//вывести можем через фор

           if(contakt != null) { //если не пустой то выводим контакт
               System.out.println(contakt.getName() + contakt.getNamber());// выводим через гет

               }
           }
       }

}

