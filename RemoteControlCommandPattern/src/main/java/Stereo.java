import org.graalvm.compiler.replacements.Log;

public class Stereo {
    public void on() {
        Log.println("Stereo on.");
    }

    public void off() {
        Log.println("Stereo off.");
    }

    public void setCD() {
        Log.println("CD set.");
    }

    public void setVolume(int volumeLevel) {
        Log.println("Volume set to " + volumeLevel);
    }
}

