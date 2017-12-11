/*==============================================================*/
/*
    # /etc/my.cnf
    --------------------------------
    character-set-server=utf8
    event_scheduler=1
    --------------------------------

CREATE DATABASE ssm DEFAULT CHARACTER SET UTF8;

// public
GRANT ALL ON ssm.* TO ssm@'%' IDENTIFIED BY 'ssm@2017';
// private
GRANT ALL ON ssm.* TO ssm@'localhost' IDENTIFIED BY 'ssm@2017';
*/
/*==============================================================*/


/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
drop table if exists t_user;
create table t_user
(
   id		int not null auto_increment,
   user_name	varchar(255),
   password	varchar(255),
   age		int(11),
   primary key (id)
);
 
