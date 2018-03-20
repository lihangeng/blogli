create table USER 
(
   ID                   bigint                         not null auto_increment,
   USER_ID              varchar(16)                    null,
   USER_NAME            varchar(16)                    null,
   PWD                  varchar(16)                    null,
   AUTHORITY            varchar(4)                     null,
   CREATE_TIME          timestamp                      null,
   FROZEN               varchar(4)                     null,
   REMARK               varbinary(128)                 null,
   PERSON_ID            varchar(16)                    null,
   RANK_ID              varchar(4)                     null,
   MARK                 bigint                         null,
   constraint PK_ON_ROAD_USER primary key clustered (ID)
);

create table PERSON 
(
   ID                   bigint                         null auto_increment,
   SEX                  varchar(4)                     null,
   QQ                   varchar(16)                    null,
   E_MAIL               varchar(16)                    null,
   BIRTHDAY             varchar(16)                    null,
   ADDRESS              varchar(32)                    null
);

create table USER_RANK 
(
   ID                   bigint                         not null auto_increment,
   RANK_ID              bigint                         null,
   RANK_MARK            bigint                         null,
   RANK_NAME            varchar(8)                     null,
   constraint PK_USER_RANK primary key clustered (ID)
);

create table BLOG 
(
   ID                   int                            not null auto_increment,
   TITLE                varchar(16)                    null,
   SUMMARY              varchar(32)                    null,
   CONTEXT              long varchar                   null,
   CREATE_TIME          timestamp                      null,
   CATEGORY_ID          int                            null,
   HITS                 int                            null,
   IMAGEURL             varchar(64)                    null,
   constraint PK_BLOG primary key clustered (ID)
);

create table BLOG_CATEGORY 
(
   ID                   int                            not null auto_increment,
   C_NAME               varchar(16)                    null,
   C_DESCRIPTION        varchar(64)                    null,
   C_NUM                int                            null,
   constraint PK_BLOG_CATEGORY primary key clustered (ID)
);

create table IMAGE 
(
   ID                   int                            not null auto_increment,
   IMAGE_NAME           varchar(32)                    null,
   IMAGE_PATH           varchar(64)                    null,
   BANNER               int                            null,
   CONTENT              long varchar                   null,
   DATETIME             timestamp                      null,
   LOVE                 int                            null,
   IHT                  int                            null,
   constraint PK_IMAGE primary key clustered (ID)
);

create table FRIEND 
(
   F_ID                 char(10)                       not null auto_increment,
   USER_ID              char(10)                       null,
   FRIEND_ID            char(10)                       null,
   constraint PK_FRIEND primary key clustered (F_ID)
);

create table ARTICLE 
(
   ID                   bigint                         not null auto_increment,
   ARTICLE_NAME         varchar(32)                    null,
   ARTICLE_TIME         timestamp                      null,
   ARTICLE_IP           varchar(32)                    null,
   ARTICLE_CLICK        int                            null,
   SORT_ARTICLE_ID      int                            null,
   USER_ID              bigint                         null,
   ARTICLE_CONTEXT      varchar(1024)                  null,
   ARTICLE_UP           varchar(4)                     null,
   ARTICLE_SUPPORT      varchar(4)                     null
);