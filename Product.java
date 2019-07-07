package java_project_1;

public class Product //We are considering products of daily life and incorporating it into OOP fashion
{
    
    private int id; // unique id of the product or item
    private String name; // name of the product
    private float price; //cost of the product
    private byte[] image; //image of the product
    
    public Product(int pid, String pname, float pprice, byte[] pimg) // constructor which assigns id, name, price and image for an instance of the product class
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.image = pimg;
    }

    //Below are the getter functions of the attributes of a product

    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public byte[] getImage()
    {
        return image;
    }
    
}
