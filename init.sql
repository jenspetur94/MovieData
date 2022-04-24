CREATE DATABASE IF NOT EXISTS MovieData;
CREATE USER 'dev'@'%' IDENTIFIED BY 'password';
GRANT ALL ON MovieData.* TO 'dev'@'%';