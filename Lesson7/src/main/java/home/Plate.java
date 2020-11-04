package home;

public class Plate {
    protected int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    // метод доьавления в тарелку еды
    public void addFood(int food){
        this.food += food;
    }

    public void getFood(int food){
        if (food <= this.food){
            this.food -= food;
        }
    }
}
