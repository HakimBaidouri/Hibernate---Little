package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com", "john.doe");

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(user);
            tx.commit();
        }

        // Récupération des utilisateurs
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<User> users = session.createQuery("from User", User.class).list();
            users.forEach(System.out::println);
        }

        HibernateUtil.getSessionFactory().close();
    }
}
