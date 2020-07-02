import org.graalvm.compiler.replacements.Log;

public class Light {
    public void on() {
        Log.println("Light on.");
    }

    public void off() {
        Log.println("Light off.");
    }
}
