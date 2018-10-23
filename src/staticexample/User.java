package staticexample;

import anotherpackage.CrowdfundingPlatform;

public class User 
{
    private String name;
    private double available;
    private int idUser;
    private static int numUsers;

    public User() {}

    public User(String name, double available) 
    {
        this.name      = name;
        this.available = available;
        this.idUser    = User.getNumUsers();
        numUsers++;
    }

    public String getName() 
    {
        return name;
    }
    public double getAvailable() 
    {
        return available;
    }
    public int getIdUser() 
    {
        return idUser;
    }
    public static int getNumUsers() 
    {
        return numUsers;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setAvailable(double available) 
    {
        this.available = available;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public static void setNumUsers(int numUsers) 
    {
        User.numUsers = numUsers;
    } 
    
    public void donateAllMoney()
    {
        CrowdfundingPlatform.getMoney(this.available);
        this.setAvailable(0.0);
    }
    public static void printNumUsers()
    {
        System.out.println("El número de usuarios es: " + User.getNumUsers());
    }
    
    // Sub-class
    public class Address
    {
        String address;

        public Address() {
        }

        public Address(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
