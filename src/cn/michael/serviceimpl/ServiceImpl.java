package cn.michael.serviceimpl;

import cn.michael.dao.UserDao;
import cn.michael.entity.User;
import cn.michael.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class ServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {

        return userDao.selectAll();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.selectAll());
    }
}
