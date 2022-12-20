import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        louis.breathing();
//        louis.eatingGrass();

        World world = new World();



        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("To switch the mode enter \"day\" or \"night\": ");
            String inputMode = String.valueOf(scanner.next()).toLowerCase(Locale.ROOT);
            switch (inputMode) {
                case "day":
                    world.mode = DayNightMode.DAY;
                    System.out.println("What a wonderful day!");
                    break;
                case "night":
                    world.mode = DayNightMode.NIGHT;
                    System.out.println("The world is sleeping...");
                    break;
                default:
                    continue;
            }

            System.out.println("Frog " + world.frog.getStateOfFrog());
            System.out.println("Sun " + world.sun.getStateOfSun());
            System.out.println("Grass " + world.grass.getStateOfGrass());
            System.out.println("Tree " + world.tree.getStateOfTree());
        }
    }
}
