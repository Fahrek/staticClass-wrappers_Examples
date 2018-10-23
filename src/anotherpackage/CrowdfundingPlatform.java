package anotherpackage;

public class CrowdfundingPlatform 
{
    private String name;
    private double ownMoney;
    private static double totalMoney = 0.0;

    public CrowdfundingPlatform() {}

    public CrowdfundingPlatform(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public double getOwnMoney() 
    {
        return ownMoney;
    }
    public static double getTotalMoney() 
    {
        return totalMoney;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    public void setOwnMoney(double ownMoney) 
    {
        this.ownMoney = ownMoney;
    }
    public static void setTotalMoney(double totalMoney) 
    {
        CrowdfundingPlatform.totalMoney = totalMoney;
    }
    
    public void assignMoney(double quantityMoney)
    {
        totalMoney   -= quantityMoney;
        this.ownMoney = quantityMoney;
    }
    public static void getMoney(double money)
    {
        CrowdfundingPlatform.totalMoney += money;
    }
    public static void printTotalMoney()
    {
        System.out.println("El dinero total del que se dispone es de: " + totalMoney);
    }
}
