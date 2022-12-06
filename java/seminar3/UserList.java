package seminar3;

import java.util.Iterator;

public class UserList implements Iterable<User> {

    private User user;
    private int counter = 0;

    public UserList() {
        user = null;
    }
    public boolean listEmpty(){
        return counter == 0;
    }

    public void add (User newUser){
    
        if (counter == 0) {
            user = newUser;
        }
        else {
            user.setNextUser(newUser);
            user = newUser;
        }
        counter++;
    }

    @Override
    public Iterator<User> iterator() {
        return new UserIterator(user);
    } 
    
}
