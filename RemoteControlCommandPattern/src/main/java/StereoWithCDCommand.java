public class StereoWithCDCommand implements Command {
    Stereo stereo;

    public StereoWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.off();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
