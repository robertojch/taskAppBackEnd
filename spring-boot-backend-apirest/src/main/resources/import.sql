INSERT INTO tasks(description,editing,status,create_at) VALUES('Complete my java course',false,false,'2020-02-25');
INSERT INTO tasks(description,editing,status,create_at) VALUES('Add my tasks in jira confluence',false,false,'2020-02-25');
INSERT INTO tasks(description,editing,status,create_at) VALUES('Finish my security course',false,false,'2020-02-25');
INSERT INTO tasks(description,editing,status,create_at) VALUES('Create all my task for US',false,false,'2020-02-25');

/* User ,Roles creation*/

INSERT INTO users(username,password,enabled) VALUES('roberto','$2a$10$6y0/GhI3Uaw5i/xVMeqOIOS578wabccofd9OBmA0KX3ThyP.CcaES',1);
INSERT INTO users(username,password,enabled) VALUES('admin','$2a$10$cRJ8cGswzMCXncnnnRe.k.w5u1nPeUWdkapuAM4yLucbxPEYRg.uW',1);

INSERT INTO roles(nombre) VALUES('ROLE_USER');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO users_roles(user_id,role_id) VALUES(1,1);
INSERT INTO users_roles(user_id,role_id) VALUES(2,2);
INSERT INTO users_roles(user_id,role_id) VALUES(2,1);