public class Iphone  extends Electronics{
    public void hasBackCamera(){
        System.out.println("Has back camera!");
    }

    @Override
    public String setColor(String color) {
        return super.color=color;
    }

    @Override
    public int powerConsumption(int powerCon) {
        return super.powerCon=powerCon;
    }

    final public void SystemOP(){
        System.out.println("You can't change OP!!!!! Don't even think about that!");
    }

}
