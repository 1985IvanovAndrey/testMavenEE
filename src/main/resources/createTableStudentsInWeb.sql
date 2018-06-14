-- auto-generated definition
CREATE TABLE studentsinweb
(
  name  VARCHAR(20),
  email VARCHAR(20) NOT NULL,
  phone VARCHAR(20) NOT NULL
);

CREATE UNIQUE INDEX studentsinweb_email_uindex
  ON studentsinweb (email);

CREATE UNIQUE INDEX studentsinweb_phone_uindex
  ON studentsinweb (phone);

