abstract class Beverage{
    public void pour(int qty){
        System.out.println("Add " + qty + " ml of Beverage");
    }
    protected abstract void addCondiment();
    protected void stir(){};
    private void serve(){
        System.out.println("Serve through waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}