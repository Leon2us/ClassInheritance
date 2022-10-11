public class Main {
    public static void main(String[] args) {

        Notebook n = new Notebook();
        n.setColor("green");
        System.out.println("Your color is "+n.color);

        Iphone i = new Iphone();
        i.setColor("blue");
        System.out.println("Your color is "+i.color);
        i.SystemOP();

        System.out.println("Your color is "+n.color);

        AirPods a = new AirPods();
        a.oxygenLevel();



    }
}