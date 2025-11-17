interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        LightAction motionSensor = () -> System.out.println("Lights ON with soft white glow.");
        LightAction nightTime = () -> System.out.println("Lights dim to 30% warm tone.");
        LightAction voiceCommand = () -> System.out.println("Changing lights to party mode!");

        motionSensor.execute();
        nightTime.execute();
        voiceCommand.execute();
    }
}
