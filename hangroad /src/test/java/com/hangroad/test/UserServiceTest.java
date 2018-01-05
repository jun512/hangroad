package com.hangroad.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hangroad.HangroadApplication;
import com.hangroad.entity.User;
import com.hangroad.repository.UserRepository;
import com.hangroad.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HangroadApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void initData() throws Exception {
        User user = new User();
        user.setUserName("test");
        user.setPassword("123456");
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }


    @Test
    public void findByUserName() throws Exception {
        User user = userService.findByUserName("test");
        System.out.println(user);
    }

}