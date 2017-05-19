package com.sudin.Cache;

import com.sudin.Entity.Users;
import com.sudin.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by Sudin Ranjitkar on 5/19/2017.
 */
@Component
public class UsersCache {

    @Autowired
    UsersRepository usersRepository;

    /**
     * we need to provide key so that we can take data of the cache
     * @return
     */
    @Cacheable(value = "usersCache", key ="#name")
    public Users getUser(String name) {
        System.out.println("Retrieving Data From Database " +name);
        return usersRepository.findByName(name);
    }
}
