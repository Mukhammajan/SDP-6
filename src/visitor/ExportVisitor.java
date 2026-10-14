package visitor;


import element.Door;
import element.Engine;
import element.Wheel;

/** Third visitor: proves extensibility - no element class was changed. */
public class ExportVisitor implements CarVisitor {
    private final StringBuilder json = new StringBuilder();

    private void append(String type, String name) {
        if (json.length() > 0) json.append(",\n");
        json.append("  {\"type\":\"").append(type).append("\",\"name\":\"").append(name).append("\"}");
    }

    @Override public void visitEngine(Engine engine) { append("engine", engine.getName()); }
    @Override public void visitWheel(Wheel wheel) { append("wheel", wheel.getName()); }
    @Override public void visitDoor(Door door) { append("door", door.getName()); }

    public String getJson() { return "[\n" + json + "\n]"; }
}