package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
