package home;

public class Cat extends Animal {
    public static int catsCount;

    public Cat (String name, double run_limit, double swim_limit, double jump_limit, int appetite){
        setRun_limit(run_limit);
        setJump_limit(jump_limit);
        setSwim_limit(jump_limit);
        setAppetite(appetite);
        setName(name);
        catsCount++;
    }

    @Override
    public void run(double distance) {
        if (distance > getRun_limit()){
            System.out.println("run: false");
        }
        else {
            System.out.println("run: true");
        }
    }

    @Override
    public void swim(double distance) {
        System.out.println("swim: false");
    }

    @Override
    public void jump(double distance) {
        if (distance > getJump_limit()){
            System.out.println("jump: false");
        }
        else {
            System.out.println("jump: true");
        }
    }
}
