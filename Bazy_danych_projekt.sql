DROP TABLE BD_PROJEKT.Customer CASCADE CONSTRAINTS;
DROP TABLE BD_PROJEKT.CustomerMovie CASCADE CONSTRAINTS;
DROP TABLE BD_PROJEKT.Movie CASCADE CONSTRAINTS;
DROP TABLE BD_PROJEKT.Producer CASCADE CONSTRAINTS;

DROP SEQUENCE BD_PROJEKT.customer_seq;
DROP SEQUENCE BD_PROJEKT.customerMovie_seq;
DROP SEQUENCE BD_PROJEKT.movie_seq;
DROP SEQUENCE BD_PROJEKT.producer_seq;

CREATE TABLE bd_projekt.Customer
(
    customer_id NUMBER(10) NOT NULL,
    first_name VARCHAR(32) DEFAULT '' NOT NULL,
    last_name VARCHAR(32) DEFAULT '' NOT NULL,
    address VARCHAR(128) DEFAULT NULL,
    birth_date DATE DEFAULT NULL,
    phone_number VARCHAR(9) DEFAULT '',
    
    CONSTRAINT CUSTOMER_PK PRIMARY KEY (customer_id)
);
/

CREATE TABLE bd_projekt.Producer
(
    producer_id NUMBER(10) NOT NULL,
    company_name VARCHAR(200) DEFAULT '',
    country VARCHAR(255) DEFAULT '',
    
    CONSTRAINT Producer_PK PRIMARY KEY (producer_id)
);
/

CREATE TABLE bd_projekt.Movie
(
    movie_id NUMBER(10) NOT NULL,
    producer_id NUMBER(10) REFERENCES bd_projekt.Producer (producer_id),
    movie_title VARCHAR(255) DEFAULT '' NOT NULL,
    movie_duration NUMBER(10) DEFAULT NULL,
    movie_rating VARCHAR(1) DEFAULT '5',
    movie_year NUMBER(4) DEFAULT '', 
    
    CONSTRAINT MOVIE_PK PRIMARY KEY (movie_id)
);
/

CREATE TABLE bd_projekt.CustomerMovie
(
    customer_movie_id NUMBER(10) NOT NULL,
    movie_id NUMBER(10) REFERENCES bd_projekt.Movie (movie_id),
    customer_id NUMBER(1) REFERENCES bd_projekt.Customer (customer_id),
    rent_date  DATE NOT NULL,
    rent_due DATE NOT NULL,
    
    CONSTRAINT CUSTOMERMOVIE PRIMARY KEY (customer_movie_id)
);
/

CREATE SEQUENCE bd_projekt.customer_seq;
/

CREATE OR REPLACE TRIGGER bd_projekt.customer_on_insert
  BEFORE INSERT ON bd_projekt.Customer
  FOR EACH ROW
BEGIN
  SELECT bd_projekt.customer_seq.nextval
  INTO :new.customer_id
  FROM dual;
END;
/

CREATE SEQUENCE bd_projekt.movie_seq;
/

CREATE OR REPLACE TRIGGER bd_projekt.movie_on_insert
  BEFORE INSERT ON bd_projekt.Movie
  FOR EACH ROW
BEGIN
  SELECT bd_projekt.movie_seq.nextval
  INTO :new.movie_id
  FROM dual;
END;
/

CREATE SEQUENCE bd_projekt.producer_seq;
/

CREATE OR REPLACE TRIGGER bd_projekt.producer_on_insert
  BEFORE INSERT ON bd_projekt.Producer
  FOR EACH ROW
BEGIN
  SELECT bd_projekt.producer_seq.nextval
  INTO :new.producer_id
  FROM dual;
END;
/

CREATE SEQUENCE bd_projekt.customerMovie_seq;
/

CREATE OR REPLACE TRIGGER bd_projekt.customerMovie_on_insert
  BEFORE INSERT ON bd_projekt.CustomerMovie
  FOR EACH ROW
BEGIN
  SELECT bd_projekt.customerMovie_seq.nextval
  INTO :new.customer_movie_id
  FROM dual;
END;
/