package facade;

public class BeverageMaker {
    private Cake cake;
    private Pastry pastry;

    public BeverageMaker() {
        this.cake = new Cake();
        this.pastry = new Pastry();
    }

    public void makeCoffe() {
        cake.make();
    }
    public void makeTea() {
        pastry.make();
    }
}
