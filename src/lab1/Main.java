package lab1;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        {
            Dog d1 = new Dog("Mike", 2);
            Dog d2 = new Dog("Helen", 7);
            Dog d3 = new Dog("Bob");


            d1.intoHumanAge();
            d2.intoHumanAge();
            d3.intoHumanAge();
        }

        {
            Ball d1 = new Ball("Зелёный", 4);
            Ball d2 = new Ball("Чёрный", 5);
            Ball d3 = new Ball("Красный", 6);

            d1.Rez();
            d2.Rez();
            d3.Rez();
        }


        {
            Book d1 = new Book("Горе от ума", 987);
            Book d2 = new Book("Тихий Дон", 598);
            Book d3 = new Book("Капитал",765);


            d1.RBook();
            d2.RBook();
            d3.RBook();
        }
        }
    }

