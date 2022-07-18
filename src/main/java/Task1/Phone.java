package Task1;

public abstract class Phone  {
    private String Name, Model, MemoryCapacity;

    public Phone(){}

    public Phone(String Name,String Model, String MemoryCapacity){
        this.Name = Name;
        this.Model = Model;
        this.MemoryCapacity = MemoryCapacity;

    }
    public  String getName(){return Name;}
    public void setName(String Name ){this.Name = Name;}

    public  String getModel(){return Model;}
    public  void setModel(String Model){this.Model = Model;}

    public String getMemoryCapacity(){return MemoryCapacity;}
    public void setMemoryCapacity(String MemoryCapacity){this.MemoryCapacity = MemoryCapacity;}

}
