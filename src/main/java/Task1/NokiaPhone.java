package Task1;

public class NokiaPhone extends Phone implements PhoneConnection {
    @Override
    public void call(){
        System.out.println("Call from Nokia");
    }
    @Override
    public void sendMassage(){
        System.out.println("Send massage from Nokia");
    }
    public NokiaPhone(){super();}
    public NokiaPhone(String Name,String Model,String MemoryCapacity){super(Name,Model,MemoryCapacity);}
}
