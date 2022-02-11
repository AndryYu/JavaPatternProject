package com.zyf.pattern.principle.compositionaggregation;

public class MySqlConnection extends DBConnection{
    @Override
    String getConnection() {
        return "MySql数据库连接";
    }
}
