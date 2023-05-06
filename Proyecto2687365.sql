create database registro;
use registro;
create table users_tbl(
user_id int not null primary key auto_increment,
user_firstname VARCHAR(40) not null,
user_lastname VARCHAR(40) not null,
user_email VARCHAR(60) not null,
user_password VARBINARY(256)
);
			
INSERT INTO registro.users_tbl (user_firstname, user_lastname, user_email, user_password) 
VALUES (UPPER('wilson'), UPPER('parra'), 'wilsonp1454@correo.com',AES_ENCRYPT
('wilson1025527142', '$2a$15$abPL48wI.iIbD/i6QmTH/uvoBPXz6ZnaodITLJnRE5yh2CardeQBi'));
INSERT INTO registro.users_tbl (user_firstname, user_lastname, user_email, user_password) 
VALUES (UPPER('stick'), UPPER('urquijo'), 'stickurquijo02@gmail.com',AES_ENCRYPT
('stick0914', '$2a$15$abPL48wI.iIbD/i6QmTH/uvoBPXz6ZnaodITLJnRE5yh2CardeQBi'));

SELECT *, CAST(AES_DECRYPT(user_password, '$2a$15$abPL48wI.iIbD/i6QmTH/uvoBPXz6ZnaodITLJnRE5yh2CardeQBi') 
AS CHAR(50)) end_data FROM users_tbl WHERE user_id = 1;  
SELECT *, CAST(AES_DECRYPT(user_password, '$2a$15$abPL48wI.iIbD/i6QmTH/uvoBPXz6ZnaodITLJnRE5yh2CardeQBi') 
AS CHAR(50)) end_data FROM users_tbl WHERE user_id = 2;      

select * from users_tbl;
DROP DATABASE registro;