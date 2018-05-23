package com.chero.bserver.sso.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Type;

/**
 * Created by hxh
 * 2018-02-21 10:40
 */
@Slf4j
public class JsonUtil {

	private static GsonBuilder gsonBuilder = new GsonBuilder();


	/**
	 * 转换为json字符串
	 * @param object
	 * @return
	 */
	public static String toJson(Object object) {
//		try {
//			return objectMapper.writeValueAsString(object);
//		} catch (JsonProcessingException e) {
//			log.info("【对象转json失败】= {}", object);
//			e.printStackTrace();
//		}
//		return null;
		gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
		return gson.toJson(object);
	}
	/**
	 * 转换为Object
	 * @param json
	 * @return
	 */
	public static <T> T toObject(String json,Class<T> clazz) {
		Gson gson = gsonBuilder.create();
		return gson.fromJson(json, clazz);
	}
	/**
	 * 转换为Object
	 * @param json
	 * @return
	 */
	public static <T> T toObject(String json, Type type) {
		Gson gson = gsonBuilder.create();
		return gson.fromJson(json, type);
	}

}
