package com.fastcampus.ch3;

public interface UserDao_n {
    int insertUser(r1User user);

    int deleteUser(String id);

    r1User selectUser(String id);

    int updateUser(r1User user);
}
