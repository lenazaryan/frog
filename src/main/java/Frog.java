public class Frog {
    World world;
    String name;

    public Frog(World world){
        this.world = world;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    void jumping(){
        System.out.println(getName() + " is jumping...");
    }
    public String getStateOfFrog(){
        if (this.world.mode == DayNightMode.DAY) {
            return "is awake, jumping and eating grass";
        } else {
            return "is sleeping";
        }
    }

}
