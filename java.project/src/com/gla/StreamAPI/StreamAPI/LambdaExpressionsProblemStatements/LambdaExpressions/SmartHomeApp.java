package StreamAPI.LambdaExpressionsProblemStatements.LambdaExpressions;
import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface LightAction {
    void execute(int lightLevel, boolean isNight);
}

class SmartHome {

    private Map<String, LightAction> actions = new HashMap<>();

    public void addAction(String trigger, LightAction action) {
        actions.put(trigger, action);
    }

    public void activate(String trigger, int lightLevel, boolean isNight) {
        LightAction action = actions.get(trigger);

        if (action != null) {
            action.execute(lightLevel, isNight);
        } else {
            System.out.println("No action for: " + trigger);
        }
    }
}

public class SmartHomeApp {

    public static void main(String[] args) {

        SmartHome home = new SmartHome();

        home.addAction("motion", (lightLevel, isNight) -> {
            if (isNight && lightLevel < 30) {
                System.out.println("Night + Low light → Dim Lights ON");
            } else if (!isNight) {
                System.out.println("Day → Lights OFF");
            } else {
                System.out.println("Enough light → No need");
            }
        });

        home.addAction("time", (lightLevel, isNight) -> {
            if (isNight) {
                System.out.println("Evening → Warm Lights ON");
            }
        });

        home.addAction("voice", (lightLevel, isNight) -> {
            System.out.println("Voice → All Lights OFF");
        });

        home.activate("motion", 20, true);
        home.activate("motion", 80, false);
        home.activate("time", 10, true);
        home.activate("voice", 0, false);
    }
}