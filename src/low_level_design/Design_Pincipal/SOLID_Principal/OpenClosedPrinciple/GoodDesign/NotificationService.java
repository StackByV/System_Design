package low_level_design.Design_Pincipal.SOLID_Principal.OpenClosedPrinciple.GoodDesign;

interface Notification{
    public void send(String message);
}

class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Send Email"+message);
    }
}

class SMSNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("Send SMS"+message);
    }
}

public class NotificationService {
    public void notify(Notification notification,String message){
        notification.send(message);
    }
}
