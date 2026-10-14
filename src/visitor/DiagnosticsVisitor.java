package visitor;


import element.Door;
import element.Engine;
import element.Wheel;
import java.util.ArrayList;
import java.util.List;

/** Operation: find problems in the car. */
public class DiagnosticsVisitor implements CarVisitor {
    private static final int MAX_ENGINE_TEMP = 105;
    private static final double MIN_PRESSURE = 2.0;

    private final List<String> problems = new ArrayList<>();

    @Override
    public void visitEngine(Engine engine) {
        if (engine.getTemperatureCelsius() > MAX_ENGINE_TEMP) {
            problems.add(engine.getName() + ": overheating (" + engine.getTemperatureCelsius() + " C)");
        }
    }

    @Override
    public void visitWheel(Wheel wheel) {
        if (wheel.getPressureBar() < MIN_PRESSURE) {
            problems.add(wheel.getName() + ": low pressure (" + wheel.getPressureBar() + " bar)");
        }
    }

    @Override
    public void visitDoor(Door door) {
        if (!door.isClosed()) {
            problems.add(door.getName() + ": not closed");
        }
    }

    public List<String> getProblems() { return problems; }
}