package app;

public class Main {
    public static void main(String[] args) {
        User user = new User("Tree St, 9");
        Address address = new Address();

        address.printUserInfo(user);

    }
}
