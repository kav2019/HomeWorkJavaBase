package home;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(10, 10, 10);
        Dog dog = new Dog(10,10,10);
        System.out.println("Проверка кошки");
        cat.Jump(11);
        cat.Jump(1);
        cat.Swim(5);
        cat.Run(11);
        cat.Run(9);
        System.out.println("\nПроверка собаки");
        dog.Jump(15);
        dog.Jump(2);
        dog.Swim(17);
        dog.Swim(3);
        dog.Run(24);
        dog.Run(1);
    }
}
