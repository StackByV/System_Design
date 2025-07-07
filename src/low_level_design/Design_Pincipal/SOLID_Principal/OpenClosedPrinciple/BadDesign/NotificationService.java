package low_level_design.Design_Pincipal.SOLID_Principal.OpenClosedPrinciple.BadDesign;

public class NotificationService {
    public void send(String type, String message){
        if(type.equals("email")){
            System.out.println("Send mail");
        } else if (type.equals("SMS")) {
            System.out.println("Send sms");
        }
    }
}

