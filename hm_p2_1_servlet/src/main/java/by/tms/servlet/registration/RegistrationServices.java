package by.tms.servlet;

import by.tms.ConsoleWriter;

import java.util.HashSet;
import java.util.Set;

public class RegistrationServices {

    InMemoryStorage inMemoryStorage = new InMemoryStorage();
    Set<User> listOfUsers = new HashSet<>();
    User user = new User();

    public String register(String name, String username, String password) {
        String status = null;

        if (isUserExist(username)) {
            status = "User with this username already registered.";
        } else {
            registerNewUser(name, username, password);
            status = "The user is registered";
        }
        return status;
    }

    private boolean isUserExist(String username) {
        boolean isUserExistFlag = false;
        boolean isUsernameEmpty = user.getUsername() == null;
        ConsoleWriter.write("Here 2 check username is empty " + isUsernameEmpty);

        if (isUsernameEmpty) {
            isUserExistFlag = false;
        } else if (user.getUsername().equals(username)) {
            ConsoleWriter.write("Here 3. when username exist");
            isUserExistFlag = true;
        }

        return isUserExistFlag;
    }

    private void registerNewUser(String name, String username, String password) {

        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);

        listOfUsers.add(user);
        inMemoryStorage.setListUsers(listOfUsers);

        ConsoleWriter.write("Here 1. Capture user");
        ConsoleWriter.write("User object: " + user.getUsername());
        ConsoleWriter.write("Set collection");
        listOfUsers.stream().forEach(e -> System.out.println(e));
    }
}
