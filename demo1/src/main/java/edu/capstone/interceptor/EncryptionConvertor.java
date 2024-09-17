package edu.capstone.interceptor;

// 加密转换器，用于将JPA查询到的数据进行加解密
// 使用AES加密算法

import jakarta.persistence.AttributeConverter;

public class EncryptionConvertor implements AttributeConverter<String, String> {
    @Override
    public String convertToDatabaseColumn(String attribute) {
        // encrypt the attribute using AES algorithm
        // AES encryption needs to be implemented here
        
        
        
        return cipher;
    }
}
