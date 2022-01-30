# JDBC-Assignement
## Software Used:
  - IntelliJ IDEA
  - WampServer MySQL
  - mysql-connector-java-8.0.28
## Overview:
  The database "madatabase" was created locally using the `CREATE DATABASE users` command. The appropriate values were inserted using `INSERT INTO users     VALUES('1','elie','hanna')` command. We can check the table content using the `SELECT *  FROM users` command. 

  <img width="674" alt="Mabasededonnees" src="https://user-images.githubusercontent.com/92988830/151717620-ff0d0034-efe7-4f73-baaa-f118ea3f9c51.png">
  We'd like to connect a Java application with the MySQL database users. We first download the approriate driver. We then add that driver to the libraries of the source file so that it can be built/loaded along with the main when we run our code.
  
  6 steps are taken to establish the connection between the database and my application:
  1. `import java.sql.*`
  2. **Register the driver class:** the forName() method of Class class is used to register and dynamically load the driver class.
  3. **Create the connection object:** the getConnection() method of DriverManager class is used to establish connection with the database.
  4. **Create the Statement object:** the createStatement() method of Connection interface is used to create statement. The object of statement is responsible to execute queries with the database.
  5. **Execute the query:** the executeQuery() method of Statement interface is used to execute queries to the database. This method returns the object of ResultSet that can be used to get all the records of a table.
  6. **Close the connection:** the close() method of Connection interface is used to close the connection. By doing so all object statements and ResultSet will be closed automatically.

  
  <img width="960" alt="1" src="https://user-images.githubusercontent.com/92988830/151717613-6d56dd2a-d59e-48a6-8055-35ca84df2af2.png">
  
  Now let's try to insert a new user into the users table. We use our declared Statement statement with the method 'executeUpdate()'. The SQL query 'INSERT INTO users VALUES()' is given as argument to the method. Then we declare another resultSet and show its output on the console.

  <img width="960" alt="2" src="https://user-images.githubusercontent.com/92988830/151717675-4921d69f-0278-4f6f-b46c-dc65378a1532.png">
  
  We check if 'georges hanna' was added to the table from the local server.
  
  <img width="674" alt="3" src="https://user-images.githubusercontent.com/92988830/151717677-aca9ced3-9507-4215-9df9-8e3712e7277f.png">
