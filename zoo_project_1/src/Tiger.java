public class Tiger extends Animal implements Eat, Walk{

    private int numOfStripes;
    private double speed;
    private int levelOfRoar;



    public Tiger() {
    }

    public Tiger(int numOfStripes, double speed, int levelOfRoar) {
        this.numOfStripes = numOfStripes;
        this.speed = speed;
        this.levelOfRoar = levelOfRoar;
    }

    public Tiger(String nameOfAnimal, int numOfStripes, double speed, int levelOfRoar) {
        super(nameOfAnimal);
        this.numOfStripes = numOfStripes;
        this.speed = speed;
        this.levelOfRoar = levelOfRoar;
    }

    public int getNumOfStripes() {
        return numOfStripes;
    }

    public void setNumOfStripes(int numOfStripes) {
        this.numOfStripes = numOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getLevelOfRoar() {
        return levelOfRoar;
    }

    public void setLevelOfRoar(int levelOfRoar) {
        this.levelOfRoar = levelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void eatingFood(){
        System.out.println("Tiger: I am eating delicious meat");
    }

    @Override
    public void walking() {
        System.out.println(" Tiger: I am walking at:" + this.getSpeed() + " mph");
    }
}

