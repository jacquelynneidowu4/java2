import java.util.ArrayList;

public class ShoppingCart{
    private ArrayList<Item> items=new ArrayList<Item>();
    private float total=0;
    private String itemList;
    private float shipping;

    public ShoppingCart(){

    }
    public ShoppingCart(float shipping){
        if(total>=10)this.shipping=shipping;
        else this.shipping=0;


    }
    ShoppingCart(ArrayList<Item> items,float total,String itemList,float shipping){
        this.items=items;
        this.total= total;
        this.itemList=itemList;
        this.shipping=shipping;

    }
    public ArrayList<Item> getItems(){
        return items;
    }
    public float getShipping(){
        return shipping;
    }
    public void addItem(Item item){
        items.add(item);

    }
    public void calculateTotal(){
        for(Item item: items){
            total+=item.getPrice();
        }
    }
    public float getTotal(){
        return (float)(total*1.06 + shipping);
    }

    public Invoice shipOrder(String name, String address,
                     String city, String state, String zip,
                             ShoppingCart cart){
        return new Invoice(name, address, city,
                state, zip,
                new ShoppingCart(items,total,itemList,shipping));

    }
    public String toString(){
        for(Item item: items){
            itemList+=item.getName() +
                    " $" + item.getPrice() + " ("+
                    item.getTotal()+ ")"+
                    " $"+ (item.getPrice()*item.getTotal())+
                    "\n";
        }
        return itemList;
    }
}