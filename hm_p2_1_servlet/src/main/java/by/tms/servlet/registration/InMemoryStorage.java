package by.tms.servlet;

import java.util.Set;

public class InMemoryStorage {

    private Set<User> listUsers;

    public InMemoryStorage() {

    }

    public Set<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(Set<User> listUsers) {
        this.listUsers = listUsers;
    }

}
