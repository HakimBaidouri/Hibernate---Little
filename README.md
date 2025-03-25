# 🧠 Hibernate Little — Simple Java Console Project

A minimal Java console application designed to help beginners **understand the core concepts of Hibernate ORM**, without the complexity of Spring Boot.

---

## 🎯 Project Purpose

This project is intended for Java developers who want to:

- 📦 Learn how Hibernate maps **Java classes to database tables**
- 🧩 Understand the role of an **ORM (Object-Relational Mapping)** tool
- ⚙️ Practice **manual Hibernate configuration** using Java code (no XML)
- 🛢️ Connect to a local **MySQL** database using environment variables

---

## 🛠️ Technologies Used

- ☕ Java 11+ (or compatible version)
- 🔄 Hibernate ORM (`hibernate-core`)
- 🐬 MySQL (local instance)
- 🧰 Maven (dependency and build management)
- 🌿 dotenv-java (for `.env` support)
- 💡 IntelliJ IDEA (recommended IDE)

---

## 🗂️ Project Structure

hibernate-fundamentals/

├── src/

│ └── main/

│ ├── java/

│ │ └── com/example/

│ │ ├── User.java

│ │ ├── Main.java

│ │ └── HibernateUtil.java

│ └── resources/

│ └── .env

├── pom.xml

└── README.md

---

## ⚙️ Setup Instructions

1. 📥 **Clone the project**

2. 🐬 **Create your local MySQL database:**

   ```sql
   CREATE DATABASE your-database;

3. ✏️ **Update your `.env` file** in `src/main/resources/`:

   ```env
   DB_URL=jdbc:mysql://localhost:3306/your_database
   DB_USER=your_username
   DB_PASSWORD=your_password
   
4.▶️ Run Main.java from your IDE

  This will:
      
      *Insert a sample User into the database
          
      *Fetch and display all users
        

✅ What You’ll Learn
-------------------

*   📌 Defining a Hibernate **entity** with annotations like @Entity, @Id, @Table, etc.
    
*   🧠 How to configure and use a **SessionFactory**
    
*   🔐 Loading environment variables from a .env file
    
*   ✍️ Performing basic **CRUD operations** (Create and Read)
    
*   👀 Viewing auto-generated SQL in the console
    

📌 Notes
--------

*   ⚠️ Hibernate’s built-in connection pool is **not for production** — it’s fine for learning.
    
*   🧼 No frameworks like Spring or Spring Boot are used — this is Hibernate **in its raw form**.
    

🚀 Next Steps
-------------

Once you’re comfortable, try adding:

*   🔗 More entities (e.g., Post, Order, Product)
    
*   🔄 Relationships (OneToMany, ManyToOne)
    
*   🔍 Custom queries using **HQL**
    
*   ✏️ Update and delete operations
