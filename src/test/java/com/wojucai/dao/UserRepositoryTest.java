package com.wojucai.dao;

import com.wojucai.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @description:
 * @author: xuyujie
 * @date: 2023/05/25
 **/
@SpringBootTest
public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    void testQuery() {
        //创建查询条件数据对象
        User user = new User();
        user.setUsername("admin");
        user.setAge(18);

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("username", ExampleMatcher.GenericPropertyMatchers.startsWith());

        Example<User> ex = Example.of(user, matcher);

        
    }

    @Test
    void testInsert() {
        User user = new User(null, "admin",
                "admin", "http://local", "男", 18, "有点傻");
        User save = userRepository.save(user);
        System.out.println(save);
    }
}
