public class WineCase
{
    private String refNo;
    private String description;
    private int noOfBottles;
    private float price;
    Website website;
    
    public WineCase(String newRefNo, String newDescription, int newNoOfBottles, float newPrice)
    {
        refNo = newRefNo;
        description = newDescription;
        noOfBottles = newNoOfBottles;
        price = newPrice;
    }    
    
    public String getRefNo()
    {
        return refNo;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getNoOfBottles()
    {
        return noOfBottles;
    }
    
    public float getPrice()
    {
        return price;
    }
}
