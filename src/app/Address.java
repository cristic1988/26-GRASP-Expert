package app;

public class Address {
    public void printUserInfo(User user) {
        user.setAddress("Tree St, 9");
        System.out.println("Адреса користувача: " + user.getAddress());
    }
}
