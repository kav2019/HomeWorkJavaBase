import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Задание 1
        Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это
        число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или
        меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)
         */

        int numbers = (int)(Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        int chance = 3;
        while (chance != 0){
//            System.out.println(numbers);
            System.out.print("Угадайте число от 0 до 9: ");
            int numbersPerson = sc.nextInt();
//            System.out.println("Вы ввели число " + numbersPerson);
            if (numbers == numbersPerson){
                System.out.println("Вы выйграли, повторить игру еще раз? 1 – да / 0 – нет");
                int numbersPlay = sc.nextInt();
                if (numbersPlay == 1){
                    numbers = (int)(Math.random() * 10);
                    chance = 3;
//                    System.out.println("Значение попыток после обнуления = " + chance);
                }else{
                    break;
                }
            }else {
                if (numbersPerson > numbers){
                    System.out.println("Вы ввели слишком большое значение");
                }else {
                    System.out.println("Вы ввели слишком маленькое значение");
                }
                chance--;
                System.out.println("У вас осталось " + chance + " попыток!");
            }
        }




        /* Задание 2
         Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
         "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
         "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}; 25 слов
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер
        показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
         */

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        int numbersRandom = (int)(Math.random() * words.length);
        String word = words[numbersRandom];
//        System.out.println(word);
        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Загаданное слово: " + word);
        System.out.print("Введите слово:  " );
        String wordPerson = sc1.nextLine();
        while (true){
            if (word.equals(wordPerson)){
                System.out.println("Вы выйграли!");
                break;
            }else {
                String promt = "";
                System.out.println("Вы не угадали, посмотрите подсказку");
                if (word.length() > wordPerson.length()){
                    for (int i = 0; i <wordPerson.length(); i++){
                        if (word.charAt(i) == wordPerson.charAt(i)){
                            promt += word.charAt(i);
                        }else{
                            promt += "#";
                        }
                    }
                }else {
                    for (int i = 0; i <word.length(); i++){
                        if (word.charAt(i) == wordPerson.charAt(i)){
                            promt += word.charAt(i);
                        }else{
                            promt += "#";
                        }
                    }
                }
                if (promt.length() < 15){
                    for (int i = promt.length(); i < 15; i++){
                        promt += "#";
                    }
                }
                System.out.println(promt);
                System.out.print("Введите слово:  " );
                wordPerson = sc1.nextLine();
        }

        }

    }
}
