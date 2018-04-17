package com.springboot.learning.core.flyway;

import org.flywaydb.core.Flyway;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/3 16:10
 */
public class FlywayApplication {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource();
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:mysql://localhost:3306/flyway_test", "root", "1234");

        // Start the migration
        flyway.migrate();
    }
}
