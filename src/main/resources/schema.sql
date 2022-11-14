drop table if exists authors;

drop table if exists books;

drop table if exists roles;

drop table if exists users;

/*==============================================================*/
/* Table : authors                                              */
/*==============================================================*/
create table authors
(
   id                   int not null,
   name                 varchar(254) null,
   primary key (id)
);

/*==============================================================*/
/* Table : books                                                */
/*==============================================================*/
create table books
(
   id                   int not null,
   authors_id           int not null,
   users_id             int not null,
   name                 varchar(254),
   primary key (id)
);

/*==============================================================*/
/* Table : roles                                                */
/*==============================================================*/
create table roles
(
   id                   int not null,
   name                 varchar(254) null,
   primary key (id)
);

/*==============================================================*/
/* Table : users                                                */
/*==============================================================*/
create table users
(
   id                   int not null,
   roles_id             int not null,
   name                 varchar(254) null,
   username             varchar(254) null,
   password             varchar(254) null,
   primary key (id)
);

alter table books add constraint fk_association1 foreign key (authors_id)
      references authors (id) on delete restrict on update restrict;

alter table books add constraint fk_association3 foreign key (users_id)
      references users (id) on delete restrict on update restrict;

alter table users add constraint fk_association4 foreign key (roles_id)
      references roles (id) on delete restrict on update restrict;

