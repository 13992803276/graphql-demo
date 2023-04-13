create table t_school (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(30) comment '班级名称',
  ranking int comment '班级排名',
);


create table t_student (
  id int not null primary key AUTO_INCREMENT,
  name varchar(30) comment '学生姓名',
  age int comment '学生年龄',
  class_id int comment '所在班级id'
);