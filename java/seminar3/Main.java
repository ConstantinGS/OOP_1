package seminar3;

public class Main {
    public static void main() {

        UserList uL1 = new UserList();
        uL1.add(new User("Ivan"));
        uL1.add(new User("Igor"));
        uL1.add(new User("Egor"));
        for (User user : uL1) {
            System.out.println(user.getNameUser());
            
        }

        
    }
}
