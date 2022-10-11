public class AirPods extends Electronics{

    public void oxygenLevel(){
        System.out.println("Oxygen present!");
    }

    @Override
    public String setColor(String color) {
        return super.color=color;
    }

    @Override
    public int powerConsumption(int powerCon) {
        return super.powerCon=powerCon;
    }
}
