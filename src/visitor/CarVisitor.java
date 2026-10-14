package visitor;



import element.Door;
import element.Engine;
import element.Wheel;

/** Visitor interface: one visitX() per concrete element. */
public interface CarVisitor {
    void visitEngine(Engine engine);
    void visitWheel(Wheel wheel);
    void visitDoor(Door door);
}