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
        a.switchMusic();
        try {
            Iphone i1 = new Iphone();
            Iphone iClone = (Iphone) i1.clone();

            i1.setColor("Violet");
            iClone.setColor("Teal");

            System.out.println("Color of i is: "+i1.color);
            System.out.println("Color of iClone is: "+iClone.color);

            i1.setColor("Deep Violet");

            System.out.println("Color of iClone is still: "+iClone.color);

            }catch (CloneNotSupportedException c){
        }


    }
}