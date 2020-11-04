package home;

public class Main {
    public static void main(String[] args) {


// создаем массив котов и тарелку и проверяем: если желание сьесть больше чем находится в тарелке, то не ест. Выводит голоден ли питомец
        Cat[] arraysCat = {
                new Cat("Пушок1" ,10, 10, 10,5),
                new Cat("Пушок2" ,10, 10, 10,10),
                new Cat("Пушок3" ,10, 10, 10,200),
                new Cat("Пушок4" ,10, 10, 10,7),
                new Cat("Пушок5" ,10, 10, 10,100)
        };
        Plate plate = new Plate(100);
        for (Cat i : arraysCat){
            i.eat(plate);
            i.isSatiety();
        }

// создаем массив собак и тарелку и проверяем: если желание сьесть больше чем находится в тарелке, то не ест. Выводит голоден ли питомец
        Dog[] arraysDog = {
                new Dog("Тузик1", 10,10,10, 200),
                new Dog("Тузик2", 10,10,10, 1),
                new Dog("Тузик3", 10,10,10, 32),
                new Dog("Тузик4", 10,10,10, 100)
        };
        Plate plate2 = new Plate(33);
        for (Dog i : arraysDog){
            i.eat(plate2);
            i.isSatiety();
        }

        //Проверка метода добавления в тарелку еды
        System.out.println("\n\n");
        plate2.addFood(100);
        arraysDog[3].eat(plate2);
        arraysDog[3].isSatiety();









// Тест 1
//        Cat cat = new Cat("Пушок" ,10, 10, 10,10);
//        Dog dog = new Dog("Тузик" ,10,10,10, 90);
//        Plate plate = new Plate(19);
//        cat.eat(plate);
//        dog.eat(plate);
//        System.out.println(cat.isSatiety());
//        System.out.println(dog.isSatiety());
    }
}

