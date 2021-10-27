// @author Evan O'Riordan

public class Module {

    private String name; // name of the module e.g. "Software Engineering 3"
    private String id; // e.g. "CT417"

    public Module(String n, String i){
        name=n;
        id=i;
    }

    @Override
    public String toString(){
        return name;
    }


    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
    }


    public String getID(){
        return id;
    }
    public void setID(String s){
        id=s;
    }
}
