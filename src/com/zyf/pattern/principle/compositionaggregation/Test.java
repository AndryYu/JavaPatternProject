package com.zyf.pattern.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
       ProductDao productDao = new ProductDao();
       productDao.setDbConnection(new MySqlConnection());
       productDao.addProduct();
    }
}
