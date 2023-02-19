package com.zy;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class encryptTest {
    @Test
    void encryptDBConfig() {
        // 生成 16 位随机 AES 密钥,用生成的密钥（ab6c7f2c4c9e3081）加密敏感信息。
        //String randomKey = AES.generateRandomKey();
        //System.out.println(randomKey);

        // 随机密钥加密
        /*String url = AES.encrypt("jdbc:sqlserver://lnkyt.gnway.org:5221;DatabaseName=ServerTo", "ab6c7f2c4c9e3081");
        String username = AES.encrypt("sa", "ab6c7f2c4c9e3081");
        String password = AES.encrypt("LNKyt666888@ln#DBServer.as$zZ%wW", "ab6c7f2c4c9e3081");
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);*/
    }
}
