package com.chero.bserver.sso.util;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_CLIENT;

/**
 * @author hxh
 * @date 2018/7/5
 */
public class SQLDeleteConstant {
    private static final String DELETED = "deleted";
    public static final String D_PREFIX = "UPDATE ";
    public static final String D = " SET " + DELETED + " = 1 WHERE id = ?";
//    public static final String D = " SET " + DELETED + " = 1 WHERE id = ? AND updateTime = ?";
    public static final String D_A = " SET " + DELETED + " = 1 WHERE id IN (?)";
}
