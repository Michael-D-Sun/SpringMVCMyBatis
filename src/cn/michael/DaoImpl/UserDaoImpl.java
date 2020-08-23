package cn.michael.DaoImpl;

import cn.michael.dao.UserDao;
import cn.michael.entity.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> selectAll() {

        return this.getSqlSession().selectList("cn.michael.entity.user.mapper.selectAll");
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println(userDao.selectAll());
    }
}
