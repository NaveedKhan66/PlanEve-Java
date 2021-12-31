public class vendor {
    
    String name;
    String email;
    String password;
    String type;
    String description;
    Boolean available;

    vendor(){
        name=null;
        email=null;
        password=null;
        type=null;
        available=true;
        description=null;
    }

    vendor(String name, String email, String password, String type, String description, Boolean available){
        this.name=name;
        this.email=email;
        this.password=password;
        this.type=type;
        this.available=available;
        this.description=description;
    }

}
