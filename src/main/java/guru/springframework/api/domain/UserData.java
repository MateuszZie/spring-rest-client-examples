package guru.springframework.api.domain;

import java.util.List;

public class UserData {

    List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
