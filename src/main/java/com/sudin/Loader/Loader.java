package com.sudin.Loader;

import com.sudin.Entity.Users;
import com.sudin.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sudin Ranjitkar on 5/19/2017.
 */
@Component
public class Loader {

    @Autowired
    UsersRepository  usersRepository;

    @PostConstruct
    public void load() {
        List<Users> usersList = getList();
        usersRepository.save(usersList);
    }

    public List<Users> getList() {
        List<Users> usersList=new ArrayList<>();
        usersList.add(new Users("sudin","ranjitkar",123L));
        usersList.add(new Users("sudeen","ranjit",132L));
        return usersList;
    }
}
