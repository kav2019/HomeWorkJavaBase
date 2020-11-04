package ru.home;

public class Staff {
    private String name;
    private String position;
    private String mail;
    private int phone;
    private double salary;
    private  int age;


    public Staff(String name, String position, String mail, int phone, double salary, int age){
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
    }

    public int getAge(){
        return this.age;
    }



    public void Info(){
        System.out.println("Работник " + name + ", возрастом " + age +" лет , занимающий должность - " + position + ", с зарплатой: "
                + salary  + "р \nДля связи Вы можете использовать: " + "\nПочту: " + mail + "\nМобильный телефон: " + phone + "\n" );
    }
}
