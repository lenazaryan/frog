import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class World {

    Enum<DayNightMode> mode;
    Sun sun;
    Grass grass;
    Frog frog;
    Tree tree;

    public World() {
        this.mode = DayNightMode.DAY;
        this.sun = new Sun(this);
        this.grass = new Grass(this);
        this.frog = new Frog(this);
        this.tree = new Tree(this);
    }

    public Enum<DayNightMode> getMode() {
        return mode;
    }

    public void setMode(Enum<DayNightMode> mode) {
        this.mode = mode;
    }


    public void setFrog(Frog frog) {
        this.frog = frog;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

}
