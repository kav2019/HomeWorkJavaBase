package home;

public abstract class Animal {
    private double run_limit;
    private double swim_limit;
    private double jump_limit;
    private int appetite;
    private String name;
    private boolean satiety;

    public void isSatiety() {
        if(satiety == true){
            System.out.println("Хозяин я сытый!");
        }else {
            System.out.println("Хозяин я голоден(((");
        }
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public double getRun_limit() {
        return run_limit;
    }

    public void setRun_limit(double run_limit) {
        this.run_limit = run_limit;
    }

    public double getSwim_limit() {
        return swim_limit;
    }

    public void setSwim_limit(double swim_limit) {
        this.swim_limit = swim_limit;
    }

    public double getJump_limit() {
        return jump_limit;
    }

    public void setJump_limit(double jump_limit) {
        this.jump_limit = jump_limit;
    }

    public abstract void run(double distance);

    public abstract void  swim(double distance);

    public abstract void jump(double distance);

    public void eat(Plate plate){
        System.out.println("Я " + getName() + ", пошел кушать");
        if (plate.getFood() < getAppetite()){
            int golod = getAppetite() - plate.getFood();
            System.out.println("Хозяин, там мало! Мне нужно: "+getAppetite() +". В тарелку необходимо доложить: " + golod +  " ! Осталось в тарелке:  " + plate.getFood());
        }else {
            plate.getFood(getAppetite());
            System.out.println("Хозяин, я покушал! Осталось в тарелке:  " + plate.getFood());
            setSatiety(true);
        }

    }
}
