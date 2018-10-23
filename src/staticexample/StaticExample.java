package staticexample;

import anotherpackage.CrowdfundingPlatform;

public class StaticExample 
{
    public static void main(String[] args) 
    {
        User u1 = new User("Andres", 500.00);
        User u2 = new User("Maria", 15.50);
        User u3 = new User("Pedro", 1200.00);
        
        User.printNumUsers();
        System.out.println("El usuario 2 tiene el ID: " + u2.getIdUser());
        
        CrowdfundingPlatform cp1 = new CrowdfundingPlatform("Save the Earth");
        CrowdfundingPlatform cp2 = new CrowdfundingPlatform("Save the Whales");
        
        u1.donateAllMoney();
        u2.donateAllMoney();
        u3.donateAllMoney();
        
        CrowdfundingPlatform.printTotalMoney();
        
        cp1.assignMoney(500);
        cp2.assignMoney(15.50);

        CrowdfundingPlatform.printTotalMoney();
        
        double PI = Math.PI;
        System.out.println("El usuario 3 tiene el ID: " + u3.getIdUser());
        double sqrdPI = Math.sqrt(PI);
        
        // Notación para llamar a clases internas dentro de otras clases
        User.Address adrs1 = u1.new Address();
        adrs1.setAddress("Calle San Silvestre");
        
        System.out.println("El usuario "  + u1.getName()   + 
                           " con el ID "  + u1.getIdUser() + 
                           " vive en la " + adrs1.getAddress());
    }
}
