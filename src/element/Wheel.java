package element;



import visitor.CarVisitor;

public class Wheel implements CarPart {
    private final String name;
    private final int diameterInches;
    private final double pressureBar;
    private final double price;

    public Wheel(String name, int diameterInches, double pressureBar, double price) {
        this.name = name;
        this.diameterInches = diameterInches;
        this.pressureBar = pressureBar;
        this.price = price;
    }

    @Override public String getName() { return name; }
    public int getDiameterInches() { return diameterInches; }
    public double getPressureBar() { return pressureBar; }
    public double getPrice() { return price; }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitWheel(this);
    }
}