package com.myrestapp.org.myrestapp.users;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akbar on 9/30/2017.
 */

@Service
public class UsersService {

    private List<Users> users = new ArrayList<>(Arrays.asList(
            new Users(1, "Shamim", "Chow"),
            new Users(2, "Dr.", "Hasan"),
            new Users(3, "Saif", "Queens"),
            new Users(4, "Ayo", "Rama")
    ));

    public List<Users> getAllUsers() {
        return users;
    }

    public Users getUser(Integer id) {
        return users.stream().filter(t -> t.getId().equals(id)).findAny().get();
    }

    public void addUser(Users users) {
        this.users.add(users);
    }


    public void updateUser(Integer id, Users users) {
        for (int i = 0; i < this.users.size(); i++) {
            Users t = this.users.get(i);
            if (t.getId().equals(id)) {
                this.users.set(i, users);
                return;
            }

        }
    }

    public void deleteUser(Integer id) {
        users.removeIf(t -> t.getId().equals(id));
    }

}