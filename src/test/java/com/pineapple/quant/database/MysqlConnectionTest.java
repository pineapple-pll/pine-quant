package com.pineapple.quant.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnectionTest {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://183.98.69.129:3306/daily_craw?useSSL=false&serverTimezone=UTC";
    private static final String USER = "psm651";
    private static final String PW = "qkrtjdals1!";

    @Test
    public void testConnection() throws Exception{

        Class.forName(DRIVER);

        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
            System.out.println(con);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
