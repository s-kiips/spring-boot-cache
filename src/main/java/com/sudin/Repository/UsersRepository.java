package com.sudin.Repository;

import com.sudin.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sudin Ranjitkar on 5/19/2017.
 */
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
