package Task1;

public class Main {
    public static void main(String[] args){
        SamsungPhone samsungPhone = new SamsungPhone("MyPhone","A70","128Gb");
        NokiaPhone nokiaPhone = new NokiaPhone("NokiaBest","N70-3","128Gb");

        samsungPhone.Call();
        samsungPhone.RecordVideo();
        samsungPhone.SendMassage();
        samsungPhone.TakePhoto();

        nokiaPhone.Call();
        nokiaPhone.SendMassage();
    }
}
