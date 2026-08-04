package Inheritance;

//Parent-1
interface clothing{
    void mens_wear();
    void women_wear();
}

//Parent-2
interface jewels{
    void gold();
    void silver();
}

//Parent-3
interface cosemetic{
    void item1();
    void item2();
}

//Child
class Amazon_cart implements clothing, jewels, cosemetic{

    @Override
    public void mens_wear() {
        System.out.println("Mens Only");
    }

    @Override
    public void women_wear() {
        System.out.println("Womens Only");
    }

    @Override
    public void item1() {
        System.out.println("Bags");
    }

    @Override
    public void item2() {
        System.out.println("Bottles");
    }

    @Override
    public void gold() {
        System.out.println("Gold, Jewels Interface");
    }

    @Override
    public void silver() {
        System.out.println("Silver, Jewels Interface");
    }
}

public class multi {
    static void main() {
        Amazon_cart a = new Amazon_cart();
        a.mens_wear();
        a.women_wear();
        a.item1();
        a.item2();
        a.gold();
        a.silver();
    }

}
