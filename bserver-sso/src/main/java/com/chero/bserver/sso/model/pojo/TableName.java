package com.chero.bserver.sso.model.pojo;

/**
 * Created by hxh on 2018/5/11.
 */
public class TableName {

    // 基础表前缀
    private static final String SYS = "sys_";
    // 业务逻辑表前缀
    private static final String DB = "db_";

    /*********************************************************************
     * 基础表
     */
    // 角色表
    public static final String SYS_ROLE = SYS + "role";
    // 授权表
    public static final String SYS_GRANT_TYPE = SYS + "grant_type";
    // 菜单表
    public static final String SYS_MENU = SYS + "menu";
    // 用户表
    public static final String SYS_USER = SYS + "user";
    // 权限表
    public static final String SYS_AUTHORITIES = SYS + "authorities";
    // 客户端表
    public static final String SYS_CLIENT = SYS + "client";
    // 作用域表
    public static final String SYS_SCOPE = SYS + "scope";
    /***********************************************************************
     */

    /****************************************************************************
     * 业务逻辑表
     */
    // 客户端与权限中间表
    public static final String DB_CLIENT_AUTHORITIES = DB + "client_authorities";
    // 客户端与授权方法中间表
    public static final String DB_CLIENT_GRANT_TYPE = DB + "client_grant_type";
    // 用户角色中间表
    public static final String DB_USER_ROLE = DB + "user_role";
    /****************************************************************************
     */
}
