drop database if exists wuliu;
create database wuliu;
use wuliu;

#用户组表
create table if not exists user_group(
	user_group_id varchar(10) primary key  comment "用户组编号",
	user_group_name varchar(10) not null comment "用户组名称",
	user_group_remarks varchar(50) comment "备注"
)default charset=utf8 comment "用户组表";

insert into user_group values("U1","oukele_U1","这是一个测试用户组!"),("U2","oulele_U2","这是第二个测试用户组!");

#顾客表
create table if not exists clinet(
	clinet_id varchar(10) not null primary key comment "顾客编号",
	clinet_name varchar(10) comment "顾客姓名",
	clinet_sex varchar(10) comment "顾客性别",
	clinet_password varchar(10) comment "顾客密码",
	clinet_tel varchar(20) comment "顾客联系电话",
	clinet_birthdate datetime comment "顾客出生日期",
	clinet_address varchar(50) comment "顾客地址",
	clinet_remarks varchar(50) comment "备注",
	user_group_id varchar(10) references user_group(user_group_id)
)default charset=utf8 comment "顾客表";

insert into clinet values
	("C_1","顾客1","男","password_1","12344321342","1999-08-28","广东省珠海市斗门区南方IT学院","这是一个测试用的顾客_C_1","U1"),
	("C_2","顾客2","女","password_2","13213321342",now(),"广西省来宾市兴宾区第八中学","这是一个测试用的顾客_C_2","U2");

#交接单
create table if not exists handover(
	handover_start_city varchar(10) not null primary key comment "起点城市",
	handover_end_city varchar(10) comment "终点城市",
	handover_reached_city varchar(10) comment "已到城市",
	handover_state int comment "状态",
	handover_generator_date datetime comment "生成时间",
	handover_remarks varchar(20) comment "备注"
)default charset=utf8 comment "交接单表";

insert into handover values("来宾市","珠海市","广州市",1,now(),"这是一次模拟."),("珠海市","来宾市","广州市",1,now(),"这是两次模拟.");

#省份表
create table if not exists province(
	province_id varchar(10) not null primary key comment"省份编号",
	province_name varchar(10) comment"省份名称"
)default charset=utf8 comment "省份表";

insert into province values("0_0","无"),("GD_1","广东省"),("GX_1","广西省");

#城市表
create table if not exists city(
	city_id varchar(10) not null primary key comment"城市编号",
	city_name varchar(10) comment "城市名称",
	province_id varchar(10) references province(province_id)
)default charset=utf8 comment "城市表";

insert into city values("0_1","无","0_0"),("laibin","来宾市","GX_1"),("zhuhai","珠海市","GD_1");

#城市区域表
create table if not exists region(
	region_id varchar(10) not null primary key comment "城市区域编号",
	region_name varchar(10) comment"城市区域名称",
	city_id varchar(10) references city(city_id)
)default charset=utf8 comment "城市区域表";

insert into region values("xingbinqu","兴宾区","laibin"),("doumenqu","斗门区","zhuhai");

#路线表
create table if not exists route(
	route_id varchar(10) not null primary key comment"路线编号",
	route_name varchar(10) comment "路线名称",
	route_carryage_price decimal(18,0) comment"运输价格",
	route_start_province varchar(10) references provunce(province_id),
	route_start_city varchar(10) references city(city_id),
	route_middle_proince varchar(10) references provunce(province_id),
	route_middle_city varchar(10) references city(city_id),
	route_end_province varchar(10) references province(province_id),
	route_end_city varchar(10) references city(city_id)
)default charset=utf8 comment "路线表";

insert into route values
	("Lu_1","广西-广东",201,"GX_1","laibin","0_0","0_1","GD_1","zhuhai"),
	("Lu_2","广东-广西",221,"GD_1","zhuhai","0_0","0_1","GX_1","laibin");

#车辆表
create table if not exists cars(
	cars_id varchar(10) not null primary key comment"车辆编号",
	cars_type varchar(10) comment"车辆型号",
	cars_production_address varchar(20) comment"产地",
	cars_production_birthdate datetime comment"生产日期",
	cars_buy_birthdate datetime comment"购买日期",
	cars_remarks varchar(20) comment"备注",
	route_id varchar(10) references route(route_id)
)default charset=utf8 comment "车辆表";

insert into cars values
	("car_1","货车","广西柳州市五菱汽车有限公司","1889-03-23 18:23:32","1972-09-23 12:22:00","五菱汽车超实用，用于广西和广东路线","Lu_1"),
	("car_2","小货车","广东某汽车有限公司","1987-01-01 12:02:01","1998-09-23 12:22:00","一款全新的货车,用于广东和广西路线","Lu_2");

#订单表
create table if not exists orders(
	orders_id varchar(10) primary key comment "订单编号",
	orders_type int comment "订单类型",
	orders_goodsname varchar(20) comment "货物名称",
	orders_goodsweight int comment "货物重量",
	orders_mailer varchar(20) comment "邮寄人",
	orders_mail_address varchar(50) comment "邮寄地址",
	orders_collect_address varchar(50) comment "收货地址",
	orders_state int comment "订单状态",
	orders_mailer_tel varchar(20) comment "邮寄人电话",
	orders_collecter varchar(20) comment "收货人",
	orders_collerter_tel varchar(20) comment "收货人电话",
	orders_start_city varchar(10) comment "起点城市",
	orders_middle_city varchar(10) comment "中点城市",
	orders_end_city varchar(10) comment "终点城市",
	orders_carrying_price decimal(18,0) comment "运送价格",
	orders_match_price decimal(18,0) comment "配送价格",
	orders_carryage_price decimal(18,0) comment "运输价格",
	orders_total varchar(10) comment "总价格",
	orders_remarks varchar(50) comment "备注",
	handover_start_city varchar(10) references handover(handover_start_city),
	cars_id varchar(10) references cars(cars_id)
)default charset=utf8 comment "订单表";

insert into orders values
	("A1",1,"Iphone7plus",12,"欧可乐","广东省珠海市斗门区南方IT学院","广西省来宾市兴宾区第八中学",1,"12345678901","欧可乐乐","09876543211","珠海市","无","来宾市",100,10,20,"4000￥","易碎物品。。小心","珠海市","car_2"),
	("A2",1,"Iphone 电脑",220,"欧可乐1","广西省来宾市兴宾区第八中学","广东省珠海市斗门区南方IT学院",1,"09876543211","欧可乐乐1","12345678901","来宾市","无","珠海市",100,10,20,"8000￥","电子产品。。小心","来宾市","car_1");

#管理员表
create table if not exists admins(
	admins_id varchar(10) primary key comment "管理员编号",
	admins_name varchar(10) comment "管理员名字",
	admins_sex int comment "管理员性别",
	admins_state int comment "状态",
	admins_city varchar(10) comment"所在城市",
	admins_address varchar(10) comment"地址",
	admins_password varchar(10) comment"密码",
	admins_tel varchar(20) comment"联系电话",
	admins_remarks varchar(20) comment"备注",
	client_id varchar(10) references client(client_id)
)default charset=utf8 comment "管理员表";

insert into admins values
	("admin","管理员1",1,1,"珠海市","广东省珠海市斗门区","password11","12345678900","用于测试的管理员","C_1"),
	("adm","管理员2",0,1,"来宾市","广西省来宾市兴宾区","password22","00987654321","用于测试的管理员","C_2");

#配送点表
create table if not exists station(
	station_id int not null primary key comment "配送点Id",
	station_name varchar(10) comment"配送点名称",
	station_tel varchar(10) comment"联系电话",
	station_address varchar(50) comment"地址",
	station_remarks varchar(50) comment"备注",
	province_id varchar(10) references province(province_id),
	city_id varchar(10) references city(city_id),
	admins_id varchar(10) references admins(admins_id)
)default charset=utf8 comment "配送点表";

insert into station values
	(1,"来宾市小鸟配送点","4190021","广西省来宾市兴宾区","用于测试的配送点","GX_1","laibin","admin"),
	(2,"斗门区大鸟配送点","5230221","广东省珠海市斗门区","用于测试的配送点1","GD_1","zhuhai","adm");

#配送范围
create table if not exists areas(
	areas_id int not null primary key comment"配送区域ID",
	areas_name varchar(10) comment"配送区域名称",
	areas_price decimal(18,0) comment"配送价格",
	areas_remarks varchar(50) comment"备注",
	city_id varchar(10) references city(city_id)
)default charset=utf8 comment "配送范围";

insert into areas values(1,"斗门区白蕉镇",10,"用于测试的数据.","zhuhai"),(2,"兴宾区第八中学",10,"用于测试的数据1","laibin");
