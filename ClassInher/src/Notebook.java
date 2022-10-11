public class Notebook  extends Electronics implements ExternalDevicesForNotebook{
    public void hasUSB(){
        System.out.println("Has USB 3.0");
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
    public void hasMouse() {
        System.out.println("Has mouse");
    }

    @Override
    public void hasCharger() {
        System.out.println("Has Charger");
    }
}

