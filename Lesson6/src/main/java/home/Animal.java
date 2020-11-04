package home;

public abstract class Animal {
    private double run_limit;
    private double swim_limit;
    private double jump_limit;


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

    public abstract void Run(double distance);

    public abstract void  Swim(double distance);

    public abstract void Jump(double distance);

}
