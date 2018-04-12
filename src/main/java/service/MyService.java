package service;

import entity.User;


/**
 * Created by dengry on 2016/12/14.
 */
public interface MyService {
    User getUserByUsernameAndPassword(String username, String password);
}
