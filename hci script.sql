-- DDL

create DATABASE db_hci_pretest;

use db_hci_pretest;

create table tbl_user
(
	id int auto_increment primary key,
	name varchar(50) null,
	address varchar(255) null,
	dob timestamp default CURRENT_TIMESTAMP not null,
	user_group_id int not null
);

create table tbl_user_group
(
	id int auto_increment primary key,
	name varchar(10) null
);

create table tbl_section
(
	id int auto_increment primary key,
	name varchar(10) not null,
	description varchar(255) null
);

create table tbl_section_order
(
	id int auto_increment primary key,
	user_group_id int not null,
	order_1 int not null,
	order_2 int not null,
	order_3 int not null,
	order_4 int not null,
	order_5 int not null
);

INSERT INTO tbl_user_group (name) VALUES ("gr01");
INSERT INTO tbl_user_group (name) VALUES ("gr02");
INSERT INTO tbl_user_group (name) VALUES ("gr03");

INSERT INTO tbl_user (name, address, dob, user_group_id) VALUES ('falah', 'Tangerang', '1991-02-20 16:00:22', 1);
INSERT INTO tbl_user (name, address, dob, user_group_id) VALUES ('ridwan', 'Depok', '1993-02-20 16:00:22', 2);
INSERT INTO tbl_user (name, address, dob, user_group_id) VALUES ('hanif', 'Pemalang', '1992-02-20 16:00:22', 3);
INSERT INTO tbl_user (name, address, dob, user_group_id) VALUES ('ayu', 'Pemalang', '1994-02-20 16:00:22', 1),
 ('nike', 'Surabaya', '1992-02-20 16:00:22', 3);
INSERT INTO tbl_user (name, address, dob, user_group_id) VALUES ('mita', 'Yogyakarta', '1994-02-20 16:00:22', 3),
 ('riska', 'Yogyakarta', '1992-02-20 16:00:22', 2),
 ('yudiko', 'Padang', '1990-02-20 16:00:22', 1),
 ('isa', 'Bogor', '1990-02-20 16:00:22', 2),
 ('desta', 'Bogor', '1992-02-20 16:00:22', 1);

INSERT INTO tbl_section (name, description) VALUES ("Promo", "PromoCard");
INSERT INTO tbl_section (name, description) VALUES ("Category", "CategoryCard");
INSERT INTO tbl_section (name, description) VALUES ("FlashSale", "FlashSaleCard");
INSERT INTO tbl_section (name, description) VALUES ("History", "HistoryCard");
INSERT INTO tbl_section (name, description) VALUES ("News", "NewsCard");

INSERT INTO tbl_section_order (user_group_id, order_1, order_2, order_3, order_4, order_5) VALUES (1, 1, 2, 3, 4, 5);
INSERT INTO tbl_section_order (user_group_id, order_1, order_2, order_3, order_4, order_5) VALUES (2, 1, 4, 3, 2, 5);
INSERT INTO tbl_section_order (user_group_id, order_1, order_2, order_3, order_4, order_5) VALUES (3, 1, 3, 2, 5, 4);

-- Query

select * from tbl_user

select * from tbl_user_group

select * from tbl_section

select * from tbl_section_order