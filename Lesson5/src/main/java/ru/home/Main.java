package ru.home;

public class Main {

    public static void main(String[] args) {

        Staff[] person = new Staff[5];
        person[0] = new Staff("Александр", "Программист", "mail@mail.ru", 8800800, 50000, 28);
        person[1] = new Staff("Иван", "Менеджер", "mail@mail.ru", 8811811, 65000, 34);
        person[2] = new Staff("Михаил", "Конструктор", "mail@mail.ru", 8822822, 42000, 42);
        person[3] = new Staff("Руслан", "Технолог", "mail@mail.ru", 8833833, 80000, 30);
        person[4] = new Staff("Павел", "Бухгалтер", "mail@mail.ru", 8844844, 69900, 49);

        for (Staff i : person){
            if (i.getAge() > 40){
                i.Info();
            }
        }

        /* Вариант 2 */

        for (int i = 0; i < person.length; i++){
            if (person[i].getAge() > 40){
                person[i].Info();
            }
        }
    }
}
