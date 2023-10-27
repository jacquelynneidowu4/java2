public class Invoice{
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private ShoppingCart cart;

    public Invoice(String name, String address, String city,
                   String state, String zip,
                   ShoppingCart cart){
        this.name=name;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.cart=cart;
    }
    public String toString(){
        String itemList="";
        String shipping = cart.getShipping()==0?"Free":cart.getShipping()+"\n";
        for(Item item: cart.getItems()){

            itemList+=item.getName() +
                    " $" + item.getPrice() + " ("+
                    item.getTotal()+ ")"+
                    " $"+ (item.getPrice()*item.getTotal())+
                    "\n";
        }
        return "Ship to: \n" +
                name + "\n"+
                address +"\n"+
                city + ", " + state + " "+ zip+ "\n"+

                "Items \n" +
                "_____\n"+
                itemList+
                "\n"+
                "Shipping: " + shipping+
                "\n"+
                "Total Cost\n"+
                "_____"+
                "$"+ cart.getTotal();






    }

}