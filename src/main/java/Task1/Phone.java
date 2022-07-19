package Task1;

public abstract class Phone  {
    private String name, model, memoryCapacity;

    public Phone(){}

    public Phone(String name,String model, String memoryCapacity){
        this.name = name;
        this.model = model;
        this.memoryCapacity = memoryCapacity;

    }
    public  String getName(){return name;}
    public void setName(String Name ){this.name = Name;}

    public  String getModel(){return model;}
    public  void setModel(String Model){this.model = Model;}

    public String getMemoryCapacity(){return memoryCapacity;}
    public void setMemoryCapacity(String MemoryCapacity){this.memoryCapacity = MemoryCapacity;}

}
