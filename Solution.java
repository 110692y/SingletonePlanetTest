import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Method Main begins");
        System.out.println(thePlanet);
        System.out.println("Method Main ends");
    }

    public static Planet thePlanet;

    static {
        System.out.println("Static block begins");
        readKeyFromConsoleAndInitPlanet();
        System.out.println("Static block ends");
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String inputValue;
        try {
            inputValue = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (inputValue.equalsIgnoreCase(Planet.SUN))
                thePlanet = Sun.getInstance();
            else if (inputValue.equalsIgnoreCase(Planet.MOON))
                thePlanet = Moon.getInstance();
            else if (inputValue.equalsIgnoreCase(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else {
                System.out.println("-Your input is invalid. \n-Choose: Moon, Sun or Earth.");
            }
            r.close();
        } catch (IOException e) {
        }
    }
}
