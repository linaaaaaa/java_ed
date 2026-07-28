package ru.alfabank.tasks_w3;
import java.util.Scanner;

public class ShopCartConsoleMenu {
    private int productsQty=0;
    private String command="";

    static void main() {
        Scanner scan = new Scanner(System.in);
        ShopCartConsoleMenu cart=new ShopCartConsoleMenu();
        System.out.println("Добро пожаловать! Введите команду:" +
                "\n0 - выход\n1 - добавить товар\n2 - удалить товар\n3 - показать кол-во товара\n");
        do{
            cart.command=scan.next();
            switch (cart.command){
                case ("0"):
                    break;
                case ("1"):
                    cart.productsQty++;
                    System.out.println("Товар добавлен");
                    break;
                case ("2"):
                    if(cart.productsQty==0){
                        System.out.println("Ошибка. Корзина пуста");
                    }
                    else {
                        cart.productsQty--;
                        System.out.println("Товар удален");
                    }
                    break;
                case ("3"):
                    System.out.println("В корзине: "+cart.productsQty);
                    break;
                default:
                    System.out.println("Команда не распознана. Введите команду:" +
                            "\n0 - выход\n1 - добавить товар\n2 - удалить товар" +
                            "\n3 - показать кол-во товара");
            }
        }
        while(!cart.command.equals("0"));
        scan.close();
    }
}
