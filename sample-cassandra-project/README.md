# Sample Spring Boot Cassandra Application

Demo application with **Spring Boot**, **Spring Data Cassandra** and **Docker**

## Prerequisites

 - Install [Docker](https://docs.docker.com/engine/installation/)
 - Download and Run the [offical Cassandra image](https://hub.docker.com/_/cassandra/)
 ```sh
docker run --name ms-cassandra-0 -v ~/workspace/data/ms-cassandra-0:/var/lib/cassandra -p 7000:7000 -p 7001:7001 -p 7199:7199 -p 9042:9042 -p 9160:9160 -d cassandra:2.2
```
 - Cassandra latest version is not supported by Spring Data Cassandra
 - Download [DataStax DevCenter](http://www.datastax.com/what-we-offer/products-services/devcenter)
 - Run the following query
 ```sql
CREATE KEYSPACE mykeyspace
WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

USE mykeyspace;

CREATE TABLE users (
  user_id int PRIMARY KEY,
  fname text,
  lname text
);

INSERT INTO users (user_id,  fname, lname)
  VALUES (1745, 'john', 'smith');
INSERT INTO users (user_id,  fname, lname)
  VALUES (1744, 'john', 'doe');
INSERT INTO users (user_id,  fname, lname)
  VALUES (1746, 'john', 'smith');
  
CREATE INDEX ON users (lname);
```
 - Start the application