java-spring-boot



References do run the project:

1. You need do install OracleXE and Maven on Windows
  1.1 You need OracleXE to access your database.
  1.2. You need Oracle JDBC Driver to connect with your database.


2. To install and configure Maven:
Reference: https://www.mkyong.com/maven/how-to-install-maven-in-windows/

3. Get Oracle JDBC Driver and transfer it to your .m2:
Reference: https://www.mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/

4. Database References:

CREATE TABLE viplist(
id NUMBER(10),
name VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL
);

ALTER TABLE viplist ADD (CONSTRAINT pk_id_viplist PRIMARY KEY (id));

CREATE SEQUENCE sq_id_viplist
 MINVALUE 1
 MAXVALUE 999999999999999999999999999
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;