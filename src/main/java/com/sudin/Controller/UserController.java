package com.sudin.Controller;

import com.sudin.Cache.UsersCache;
import com.sudin.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sudin Ranjitkar on 5/19/2017.
 */
@RestController
public class UserController {

    @Autowired
    UsersCache usersCache;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(){
        return "Hello Sudin";
    }

    @RequestMapping(value = "users/{name}",method = RequestMethod.GET)
    public Users getUser(@PathVariable final String name) {
        return usersCache.getUser(name);
    }
}
