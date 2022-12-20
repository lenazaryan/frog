public class Grass {
    World world;
    Integer infiniteAmount = Integer.MAX_VALUE;

    public Integer getInfiniteAmount() {
        return infiniteAmount;
    }

    public void setInfiniteAmount(Integer infiniteAmount) {
        this.infiniteAmount = infiniteAmount;
    }

    public Grass(World world){
        this.world = world;
    }

    String getStateOfGrass(){
        if (this.world.mode == DayNightMode.DAY) {
            return " is growing";
        } else {
            return " is not growing";
        }
    }
    void growing(){
        System.out.println("Grass is growing...");
    }

    void eaten(){
        growing();
    }
}
