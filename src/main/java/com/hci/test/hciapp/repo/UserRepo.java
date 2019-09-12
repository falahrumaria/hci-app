package com.hci.test.hciapp.repo;

import com.hci.test.hciapp.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Integer> {

    UserEntity findById(int id);
}
