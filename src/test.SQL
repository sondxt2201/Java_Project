CREATE TABLE KHUPHO (
maKhuPho char(25) not null,
tenKhuPho nvarchar(50) not null,
primary key (maKhuPho)
);

CREATE TABLE HODAN ( 
maHoDan char(25) not null,
soThanhVien int not null,
soNha nvarchar(50) not null,
maKhuPho char(25) not null,
primary key (maHoDan)
);

create table NGUOI (
maNguoi char(25) not null,
hoVaTen nvarchar(50) not null,
tuoi int,
namSinh int not null,
ngheNghiep nvarchar(50),
maHoDan char(25) not null,
primary key (maNguoi)
);

create table USERITEM (
tenTaiKhoan char(25) not null,
matKhau char(25) not null,
vaiTro bit not null,
primary key (tenTaiKhoan)
);

INSERT INTO USERITEM VALUES ('admin01', 'admin123', 1);
INSERT INTO USERITEM VALUES ('admin02', 'admin123', 0);
INSERT INTO USERITEM VALUES ('admin03', 'admin123', 1);

INSERT INTO NGUOI VALUES ('NG01', 'tran van a', 20, 2000, 'sinh vien', 'HD01');
INSERT INTO NGUOI VALUES ('NG02', 'tran van b', 21, 1999, 'sinh vien', 'HD02');
INSERT INTO NGUOI VALUES ('NG03', 'tran van c', 22, 1998, 'sinh vien', 'HD03');
INSERT INTO NGUOI VALUES ('NG04', 'tran van d', 23, 1997, 'sinh vien', 'HD04');
INSERT INTO NGUOI VALUES ('NG05', 'tran van e', 24, 1996, 'sinh vien', 'HD05');

INSERT INTO HODAN VALUES ('HD01', 2, '123a', 'KP01');
INSERT INTO HODAN VALUES ('HD02', 3, '123b', 'KP02');
INSERT INTO HODAN VALUES ('HD03', 4, '123c', 'KP03');
INSERT INTO HODAN VALUES ('HD04', 5, '123d', 'KP04');
INSERT INTO HODAN VALUES ('HD05', 6, '123e', 'KP05');

INSERT INTO KHUPHO VALUES ('KP01', 'Khu Pho A');
INSERT INTO KHUPHO VALUES ('KP02', 'Khu Pho B');
INSERT INTO KHUPHO VALUES ('KP03', 'Khu Pho C');
INSERT INTO KHUPHO VALUES ('KP04', 'Khu Pho D');
INSERT INTO KHUPHO VALUES ('KP05', 'Khu Pho E');


