public class user {
    
    String name;
    String email;
    String password;

    user(){
        name=null;
        email=null;
        password=null;
        type=null;
        available=true;
        description=null;
    }

    user(String name, String email, String password){
        this.name=name;
        this.email=email;
        this.password=password;
    }

}
