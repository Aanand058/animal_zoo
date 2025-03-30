public class Penguin extends Animal implements Walk, Swim {


    private boolean isSwimming;
    private double walkSpeed;
    private double swimSpeed;

    public Penguin() {
    }

    public Penguin(boolean isSwimming, double walkSpeed, double swimSpeed) {
        this.isSwimming = isSwimming;
        this.walkSpeed = walkSpeed;
        this.swimSpeed = swimSpeed;
    }

    public Penguin(String nameOfAnimal, boolean isSwimming, double walkSpeed, double swimSpeed) {
        super(nameOfAnimal);
        this.isSwimming = isSwimming;
        this.walkSpeed = walkSpeed;
        this.swimSpeed = swimSpeed;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }


    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating fish.");
    }


    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }


    @Override
    public void walking() {
        if (!isSwimming) {
            System.out.println("Penguin: I waddle while walking at a speed of " + walkSpeed + " km/h.");
        } else {
            System.out.println("Penguin: I cannot walk while swimming!");
        }
    }

    @Override
    public void swimming() {
        if (isSwimming) {
            System.out.println("Penguin: I am swimming at a speed of " + swimSpeed + " km/h.");
        } else {
            System.out.println("Penguin: I cannot swim while walking!");
        }
    }
}
