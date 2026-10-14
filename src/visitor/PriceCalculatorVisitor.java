package visitor;


import element.Door;
import element.Engine;
import element.Wheel;

/** Operation: total price of all visited parts. */
public class PriceCalculatorVisitor implements CarVisitor {
    private double total;

    @Override public void visitEngine(Engine engine) { total += engine.getPrice(); }
    @Override public void visitWheel(Wheel wheel) { total += wheel.getPrice(); }
    @Override public void visitDoor(Door door) { total += door.getPrice(); }

    public double getTotal() { return total; }
}