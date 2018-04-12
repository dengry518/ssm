package service;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dengry on 2016/12/14.
 */
@Service
public class MyServiceImpl implements MyService {
    @Autowired
    UserDao userDao;

    public User getUserByUsernameAndPassword(String username, String password) {
        return userDao.getUserByUsernameAndPassword(username, password);
    }
}
