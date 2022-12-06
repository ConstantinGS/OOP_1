package seminar3;

public class User {

    public User(String nameUser) {
        this.nameUser = nameUser;
    }
    
    public String nameUser;
    public User nextUser;

    public String getNameUser() {
        return nameUser;
    }
    public User getNextUser() {
        return nextUser;
    }
    public void setNextUser(User nextUser) {
        this.nextUser = nextUser;
    }

    

    


}
