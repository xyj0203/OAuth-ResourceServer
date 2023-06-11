package com.wojucai.dao;

import com.wojucai.entity.Client;
import com.wojucai.entity.User;
import com.wojucai.util.TextUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @description: Client配置类
 * @author: xuyujie
 * @date: 2023/06/11
 **/
@SpringBootTest
public class ClientRepositoryTest {

    @Resource
    private ClientRepository clientRepository;

    @Test
    void testInsert() {
        Client client = new Client(null, TextUtils.generateRandomCode(16),
                TextUtils.generateRandomCode(16), "http://localhost:8080/login",
                "[profile, img, age]", "测试客户端功能", "测试客户端");
        System.out.println(clientRepository.save(client));
    }

    @Test
    void testUpdate() {
        Client client = new Client(2, TextUtils.generateRandomCode(16),
                TextUtils.generateRandomCode(16), "http://localhost:8080/login",
                "[profile, img]", "测试客户端功能", "测试客户端");
        System.out.println(clientRepository.save(client));
    }
}
