package element;



import visitor.CarVisitor;

public class Engine implements CarPart {
    private final String name;
    private final int horsePower;
    private final int temperatureCelsius;
    private final double price;

    public Engine(String name, int horsePower, int temperatureCelsius, double price) {
        this.name = name;
        this.horsePower = horsePower;
        this.temperatureCelsius = temperatureCelsius;
        this.price = price;
    }

    @Override public String getName() { return name; }
    public int getHorsePower() { return horsePower; }
    public int getTemperatureCelsius() { return temperatureCelsius; }
    public double getPrice() { return price; }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitEngine(this); // double dispatch
    }
}