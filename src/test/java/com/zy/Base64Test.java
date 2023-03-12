package com.zy;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class Base64Test {
    @Test
    public void base64Test()
    {

        // 使用基本编码
        String base64encodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes(StandardCharsets.UTF_8));
        System.out.println("Base64 编码字符串 (基本) :" + base64encodedString);
        System.out.println("--------------------------------------------");
        // 解码
        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        System.out.println("Base64 编码字符串 (基本) 原始字符串: " + new String(base64decodedBytes, StandardCharsets.UTF_8));
        System.out.println("============================================");

        base64encodedString = Base64.getUrlEncoder().encodeToString("runoob?java8".getBytes(StandardCharsets.UTF_8));
        System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);
        System.out.println("--------------------------------------------");
        // 解码
        byte[] base64urldecodedBytes = Base64.getUrlDecoder().decode(base64encodedString);
        System.out.println("Base64 编码字符串 (URL) 原始字符串: " + new String(base64urldecodedBytes, StandardCharsets.UTF_8));
        System.out.println("============================================");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID());
        }
        System.out.println("stringBuilder:" + stringBuilder);
        System.out.println("============================================");

        byte[] mimeBytes = stringBuilder.toString().getBytes(StandardCharsets.UTF_8);
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);

    }
}
