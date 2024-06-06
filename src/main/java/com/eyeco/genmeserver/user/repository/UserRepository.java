package com.eyeco.genmeserver.user.repository;

import com.eyeco.genmeserver.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
