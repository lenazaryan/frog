public class Tree {
    World world;

    public Tree(World world){
        this.world = world;
    }

    String getStateOfTree(){
        if (this.world.mode == DayNightMode.DAY){
            return "is producing oxygen";
        } else return "is not photosynthesising";
    }
    void photosynthesis() {
        System.out.println("Tree is producing oxygen...");
    }

}
