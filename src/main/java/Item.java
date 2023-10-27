public class Item{
    private float price;
    private int total;
    private String itemName;

    public Item(float price, int total, String itemName){
        this.price=price;
        this.total=total;
        this.itemName=itemName;
    }
    public String getName(){
        return itemName;
    }
    public float getPrice(){
        return price;

    }

    public int getTotal() {
        return total;
    }
}