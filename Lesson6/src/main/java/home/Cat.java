package home;

public class Cat extends Animal {


    public Cat (double run_limit, double swim_limit, double jump_limit){
        setRun_limit(run_limit);
        setJump_limit(jump_limit);
        setSwim_limit(jump_limit);
    }

    @Override
    public void Run(double distance) {
        if (distance > getRun_limit()){
            System.out.println("run: false");
        }
        else {
            System.out.println("run: true");
        }
    }

    @Override
    public void Swim(double distance) {
        System.out.println("swim: false");
    }

    @Override
    public void Jump(double distance) {
        if (distance > getJump_limit()){
            System.out.println("jump: false");
        }
        else {
            System.out.println("jump: true");
        }
    }
}
