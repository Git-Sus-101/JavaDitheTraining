package strings;

public class Demo {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.acc_number);
        System.out.println(b.balance);
        b.setData(1111);
        System.out.println(b.getDate());
        b.deposit(1111,20000.00);
        b.withdrawal(1111, 5000);
        b.checkbalance(1111);


    }
}