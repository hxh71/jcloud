package com.chero.bserver.sso.util;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Created by hxh on 2018/5/11.
 */
public class IDUtil {
    private IDUtil() {}

    private static SecureRandom random = new SecureRandom();
    private static IdWorker idWorker = new IdWorker(-1, -1);

    public static String genUUID(){
        String s = UUID.randomUUID().toString();
        //去掉“-”符号
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
    public static String genRandom4Word() {
        String[] beforeShuffle = new String[] { "2", "3", "4", "5", "6", "7",
                "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z" };
        List list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        String result = afterShuffle.substring(5, 9);
        return result;
    }
    public static String genRandom4Word(String s) {
       return s + "_" + genRandom4Word();
    }
    /**
     * 使用SecureRandom随机生成Long.
     */
    public static long randomLong() {
        return Math.abs(random.nextLong());
    }
    /**
     * 获取新唯一编号（18为数值）
     * 来自于twitter项目snowflake的id产生方案，全局唯一，时间有序。
     * 64位ID (42(毫秒)+5(机器ID)+5(业务编码)+12(重复累加))
     */
    public static long gen18Id() {
        return idWorker.nextId();
    }
}
