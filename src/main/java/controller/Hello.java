package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MyService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dengry on 2016/12/14.
 */
@Controller
public class Hello {
    @Autowired
    private MyService myService;


    @RequestMapping("/test")
    @ResponseBody
    public User hello(String username, String password) throws Exception {
        User user = myService.getUserByUsernameAndPassword(username, password);
        return user;

    }
}
