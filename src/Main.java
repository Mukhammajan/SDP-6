

import element.*;
import visitor.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry");
        car.addPart(new Engine("V6 Engine", 301, 112, 4500));
        car.addPart(new Wheel("Front-Left Wheel", 17, 2.3, 150));
        car.addPart(new Wheel("Front-Right Wheel", 17, 1.7, 150));
        car.addPart(new Door("Driver Door", true, 400));
        car.addPart(new Door("Passenger Door", false, 400));

        PriceCalculatorVisitor price = new PriceCalculatorVisitor();
        DiagnosticsVisitor diagnostics = new DiagnosticsVisitor();
        ExportVisitor export = new ExportVisitor();

        for (CarPart part : car.getParts()) {
            part.accept(price);
            part.accept(diagnostics);
            part.accept(export);
        }

        System.out.println("Car: " + car.getModel());
        System.out.println("Total price: $" + price.getTotal());
        System.out.println("Problems found:");
        diagnostics.getProblems().forEach(p -> System.out.println(" - " + p));
        System.out.println("Export:\n" + export.getJson());
    }
}