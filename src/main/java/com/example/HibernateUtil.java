package com.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Dotenv dotenv = Dotenv.load();

            Configuration config = new Configuration();

            config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
            config.setProperty("hibernate.connection.url", dotenv.get("DB_URL"));
            config.setProperty("hibernate.connection.username", dotenv.get("DB_USER"));
            config.setProperty("hibernate.connection.password", dotenv.get("DB_PASSWORD"));
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
            config.setProperty("hibernate.hbm2ddl.auto", "update");
            config.setProperty("hibernate.show_sql", "true");

            config.addAnnotatedClass(com.example.User.class);

            return config.buildSessionFactory();
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw new ExceptionInInitializerError("SessionFactory error: " + ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
