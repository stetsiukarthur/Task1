package Task1;

import Task1.Phone;
import Task1.PhoneConnection;
import Task1.PhoneMedia;

public class SamsungPhone  extends Phone implements PhoneConnection, PhoneMedia {
    @Override
    public void Call(){System.out.println("Call from Samsung");}
    @Override
    public void TakePhoto(){System.out.println("Take photo from Samsung");}
    @Override
    public  void RecordVideo(){System.out.println("Record video from Samsung");}
    @Override
    public void SendMassage(){System.out.println("Send massage from Samsung");}
    public SamsungPhone(){super();}
    public SamsungPhone (String Name,String Model,String MemoryCapacity){super(Name, Model,MemoryCapacity );}
}
