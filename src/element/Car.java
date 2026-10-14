package element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Object structure: holds the parts; the client traverses it. */
public class Car {
    private final String model;
    private final List<CarPart> parts = new ArrayList<>();

    public Car(String model) { this.model = model; }

    public void addPart(CarPart part) { parts.add(part); }
    public String getModel() { return model; }
    public List<CarPart> getParts() { return Collections.unmodifiableList(parts); }
}