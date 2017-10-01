package com.myrestapp.org.myrestapp.controller;

import com.myrestapp.org.myrestapp.users.Users;
import com.myrestapp.org.myrestapp.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by akbar on 9/30/2017.
 */

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;


    @RequestMapping("/users")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @RequestMapping("/users/{id}")
    public Users getUser(@PathVariable Integer id) {
        return usersService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody Users users) {
        usersService.addUser(users);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody Users users, @PathVariable Integer id) {
        usersService.updateUser(id, users);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        usersService.deleteUser(id);
    }


}
