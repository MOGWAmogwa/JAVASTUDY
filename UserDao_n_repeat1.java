package com.fastcampus.ch3;

public interface UserDao_n_repeat1 {
    int insertUser(r1User user);

    int deleteUser(String id);

    int updateUser(r1User user);

    r1User selectUser(String id);


}
