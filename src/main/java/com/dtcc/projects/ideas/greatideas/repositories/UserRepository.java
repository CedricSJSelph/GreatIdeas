package com.dtcc.projects.ideas.greatideas.repositories;

import java.util.List;

public interface UserRepository {
    User findByEmail(String email);
    List<User> findAll();
    boolean existsByEmail(String email);
}
