package com.joern.persistence;

import com.joern.model.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends BaseRepository<User, Long> {

}