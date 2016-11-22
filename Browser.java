public class Browser
{
    private int yearOfBirth;
    private String email;
    private int iD;
    private boolean isBuyer;
    WineCase wineCase;
    Website website;
    
    public Browser(int newYearOfBirth, String newEmail, int newId)
    {
        yearOfBirth = newYearOfBirth;
        email = newEmail;
        iD = newId;
        isBuyer = false;
    }
    
    public Browser(int newYearOfBirth, String newEmail)
    {
        yearOfBirth = newYearOfBirth;
        email = newEmail;
        iD = 123;
        isBuyer = false;
    }
    
    public int getId()
    {
        return iD;
    }    
    
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }    
    
    public String getEmail()
    {
        return email;
    }   
    
    public void setBuyerStatus(boolean newLogin)
    {
        isBuyer = newLogin;
    }    
    
    public void setId(int newId)
    {
        iD = newId;
    }    
    
    public void selectWineCase(WineCase wineCase)
    {
        if (isBuyer = true)
        {
            System.out.println("Buyer " + iD + " has selected wine case ref number " + wineCase.getRefNo() + " of " + wineCase.getNoOfBottles() + " " + wineCase.getDescription() + " at £" + wineCase.getPrice());
        }    
    } 
    
    public void setWebsite(Website newWebsite) 
    {
        website = newWebsite;
    }
    
    public void payForWine()
    {
        website.checkHitDiscount();
        website.checkout(this);
    }
}






