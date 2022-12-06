package seminar3;

import java.util.Iterator;

public class UserIterator implements Iterator<User> {
    
    private User iterUser;

    public UserIterator(User user) {
        iterUser = user;
    }

    @Override
    public boolean hasNext() {
        return iterUser!=null;
    }

    @Override
    public User next() {
        User nextUser = iterUser;
        iterUser.getNextUser();
        return nextUser;
    }
    
}
