

 public class Dolphin extends Animal implements Eat, Swim{
    private String color;
    private double swimSpeed;

    public Dolphin(String color, double swimSpeed) {
        this.color = color;
        this.swimSpeed = swimSpeed;
    }

    public Dolphin(String nameOfAnimal, String color, double swimSpeed) {
        super(nameOfAnimal);
        this.color = color;
        this.swimSpeed = swimSpeed;
    }

    public String getColor() {
        return color;
    }

    public Dolphin() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed "+ this.getSwimSpeed() + " nautical miles per hour");
    }
}
