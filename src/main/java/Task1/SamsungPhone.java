package Task1;

import Task1.Phone;
import Task1.PhoneConnection;
import Task1.PhoneMedia;

public class SamsungPhone  extends Phone implements PhoneConnection, PhoneMedia {

    public float cameraExtension;
    public boolean wideAngle;


    @Override
    public void call(){System.out.println("Call from Samsung");}
    @Override
    public void takePhoto(){System.out.println("Take photo from Samsung");}
    @Override
    public  void recordVideo(){System.out.println("Record video from Samsung");}
    @Override
    public void sendMassage(){System.out.println("Send massage from Samsung");}
    public SamsungPhone(){super();}
    public SamsungPhone (String name,String model,String memoryCapacity, float cameraExtension, Boolean wideAngle) {
        super(name, model,memoryCapacity);
        this.cameraExtension = cameraExtension;
        this.wideAngle = wideAngle;
    }
}
