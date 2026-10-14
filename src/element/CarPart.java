package element;



import visitor.CarVisitor;

/** Element interface: any part of a car that can be visited. */
public interface CarPart {
    String getName();
    void accept(CarVisitor visitor);
}