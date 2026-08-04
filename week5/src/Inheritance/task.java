package Inheritance;

class SocialMedia{
    void display(){
        System.out.println("Social Media Apps");
    }
}

class WhatsApp extends SocialMedia{
    void WhatsApp_details(){
        System.out.println("WhatsApp Chat");
    }
}

class Chats extends SocialMedia{
    void Chats_details(){
        System.out.println("WhatsApp Business Chat");
    }
}

class Status extends SocialMedia{
    void Status_details(){
        System.out.println("WhatsApp Status");
    }
}

public class task {
    static void main() {
        WhatsApp w = new WhatsApp();
        w.WhatsApp_details();
        w.display();
        Chats c = new Chats();
        c.Chats_details();
        c.display();
        Status s = new Status();
        s.Status_details();
        s.display();
    }

}
