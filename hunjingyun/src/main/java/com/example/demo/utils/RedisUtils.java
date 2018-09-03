package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {
	
	@Autowired
	private StringRedisTemplate template;
	
	/**
	 * 删除
	 * @param key
	 */
	public void delete(String key) {
		template.delete(key);
	}
	
	/**
	 * 添加
	 * @param key
	 * @param value
	 */
	public void set(String key, String value) {
		template.opsForValue().set(key, value);
	}
	
	/**
	 * 获取
	 * @param key
	 * @return
	 */
	public String get(String key) {
	return	template.opsForValue().get(key);
	}

}
