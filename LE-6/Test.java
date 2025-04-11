public class Test {
    public static void main(String[] args) {
        Offering o = new Coffee();
        o = new Rum(o);
        o = new Rum(o);
        System.out.println(o.getName() + " " + o.getPrice() );
    }
}