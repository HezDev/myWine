import java.util.Random;
public class Website
{
    private int hits;
    private float salesTotal;
   
    public Website()
    {
        hits = 0; 
        salesTotal = 0;
        
    } 
    
    public int getHits()
    {
        return hits;
    }    
    
    public float getSalesTotal()
    {
        return salesTotal;
    }    
    
    public void buyerLogin(Browser browser)
    {
        System.out.println("Wine Direct welcomes buyer " + browser.getId() + ", you are now logged in.");
        browser.setWebsite(this);
        hits += 1;
    }    
    
    public void becomeBuyer(Browser browser)
    {
        if (2016 - browser.getYearOfBirth() > 18)
        {
            Random rng = new Random();
            browser.setId(rng.nextInt());
            browser.setBuyerStatus(true);
            buyerLogin(browser);
        }    
    }  
    
    public void checkout(Browser browser)
    {
        checkHitDiscount();
    }
    
    public void checkHitDiscount()
    {
        if (hits % 10 == 0)
        {
            // discount = winecase.getPrice() - (float) (winecase.getPrice() / 10f * 9f);
            System.out.println("Congratulations there is a 10% discount available to you");
        }    
        else 
        { 
            System.out.println("Your transaction was completed successfully.");
        }
    }
}
