# Kubernetes Cassandra sample cluster configuration

## Steps

 - Install [Docker](https://docs.docker.com/engine/installation/)
 - Setup [Kubernetes](http://kubernetes.io/docs/getting-started-guides/docker/)
  
 ```sh
 ./configuration/kubernetes_install.sh
``` 
 
 - Setup [Cassandra cluster](https://github.com/kubernetes/kubernetes/tree/release-1.2/examples/cassandra)
 - Get the cluster's IP addresses with the following command
 
  ```sh
kubectl get endpoints cassandra -o yaml
```
 
 - Download [DataStax DevCenter](http://www.datastax.com/what-we-offer/products-services/devcenter)
 - Run the following script 
 
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