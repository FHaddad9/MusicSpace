package com.musicspace.MusicSpace.repository;

import com.musicspace.MusicSpace.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA manages user entity and id key
public interface UserRepository extends JpaRepository<User, Long> {

}
