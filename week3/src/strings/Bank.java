package strings;
//Encapsulation --- providing controlled to the private datamembers of the class using setters and getter methods
class Bank {
    private int pin = 1111;
    String acc_number = "SB1000001";
    double balance =200000.00;

    //setter() method is to initalize the private variable
    public void setData(int u_pin)
    {
        pin = u_pin;
    }

    //gette() method is used to return/get the private variable
    public int getDate()
    {
        return pin;
    }

    //deposit, withdrawal, checkbalance
    void deposit(int pin, double amount)
    {
        if(this.pin == pin)
        {
            balance+=amount;
            System.out.println("Amount deposited successfully");
        }
        else
        {
            System.out.println("Invalid Pin");
        }
    }
    void withdrawal(int pin, double amount)
    {
        if(this.pin == pin)
        {
            if(amount>balance)
            {
                System.out.println("Insufficient balance");
            }
            else
            {
                balance-=amount;
                System.out.println("Amount withdrawn successfully");
            }
        }
        else
        {
            System.out.println("Invalid Pin");
        }
    }
    void checkbalance(int pin)
    {
        if(this.pin == pin)
        {
            System.out.println("Current Balance:"+balance);
        }
        else
        {
            System.out.println("Invalid Pin");
        }
    }
}