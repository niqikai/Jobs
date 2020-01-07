
drop table if exists ums_user;
create table ums_user
(
    id         int auto_increment primary key,
    username   varchar(30) not null unique,
    password   varchar(30),
    sign_up_time timestamp default current_timestamp() comment '注册时间'
) comment ='用户表';



drop table if exists rms_resume;
create table rms_resume
(
    id          int auto_increment primary key,
    user_id      int         not null comment '简历所有者id',
    name        varchar(30) not null,
    birthday    date        not null,
    degree      int         not null,
    gender      int         not null,
    phone_number varchar(11) not null,
    experience  text  COMMENT '工作经历',
    create_time  timestamp default current_timestamp()
) comment ='简历表';

drop table if exists rms_work_experience;
create table rms_work_experience
(
    id          int auto_increment primary key,
    resume_id    int         not null,
    start_date   date        not null,
    end_date     date        not null,
    company     varchar(30) not null,
    description text        not null,
    create_time  timestamp default current_timestamp()
);

drop table if exists pms_applied_position;
create table pms_applied_position
(
    id         int auto_increment primary key,
    position_id int not null comment '职位id',
    user_id   int not null comment '申请人id',
    checked    bit not null default 0 comment '是否已查看:0否，1是',
    create_time timestamp    default current_timestamp()
) comment ='职位投递简历表';



drop table if exists pms_position;
create table pms_position
(
    id             int auto_increment primary key,
    job_title       varchar(30) not null comment '职位名称',
    company_name    varchar(30) not null comment '公司名称',
    city_id         int         not null comment '城市id',
    job_description text        not null comment '职位描述',
    industry       int         not null comment '所属行业id',
    position_type   int         not null comment '职位类型id',
    min_salary      decimal     not null comment '工资下限',
    max_salary      decimal     not null comment '工资上限',
    suspend        bit         not null default 0 comment '是否中止招聘：0否，1是',
    creator_id      int         not null comment '创建人id',
    create_time     timestamp   not null default current_timestamp()
) comment ='职位表';








drop table if exists sys_dict_type;
create table sys_dict_type
(
    id   int auto_increment primary key,
    name varchar(30) not null unique comment '字典类型的中文名称'
) comment ='系统字典表类型';
insert into sys_dict_type (name) values ('行业');
insert into sys_dict_type (name) values ('职位类型');
insert into sys_dict_type (name) values ('教育背景');
insert into sys_dict_type (name) values ('性别');

drop table if exists sys_dict_data;
create table sys_dict_data
(
    id     int auto_increment primary key,
    type_id int         not null comment '类型id',
    code   varchar(50) not null unique comment '字典编码',
    name   varchar(30) not null comment '字典中文名称'
) comment ='系统字典表';


drop table if exists sys_city;
create table sys_city
(
    id        int         not null primary key,
    city_name  varchar(30) not null comment '城市名称',
    parent_id  int         not null comment '父级id',
    short_name varchar(30) not null comment '城市缩写名称',
    depth     int(1)      not null comment '城市层级',
    city_code  varchar(4)  not null comment '城市代码',
    merge_name varchar(50) not null comment '城市组合名称'
) comment ='区县行政编码字典表' ;
