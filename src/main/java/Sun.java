public class Sun {
    World world;
    public Sun(World world){
        this.world = world;
    }
    String getStateOfSun(){
     if (this.world.mode == DayNightMode.DAY){
         return "is shining";
     } else return "is not giving light";
    }
    void lightOn(){
        System.out.println("Sun is shining...");
    }

}
