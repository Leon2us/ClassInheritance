public class AirPods extends Electronics implements HeadPhonesFunctions, Cloneable{

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

    @Override
    public void switchMusic() {
        System.out.println("Click two times to change Noise control.");
    }
}
