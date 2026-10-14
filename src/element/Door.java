package element;



import visitor.CarVisitor;

public class Door implements CarPart {
    private final String name;
    private final boolean closed;
    private final double price;

    public Door(String name, boolean closed, double price) {
        this.name = name;
        this.closed = closed;
        this.price = price;
    }

    @Override public String getName() { return name; }
    public boolean isClosed() { return closed; }
    public double getPrice() { return price; }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitDoor(this);
    }
}