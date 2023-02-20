DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS interest_group;
DROP TABLE IF EXISTS event_member;
DROP TABLE IF EXISTS group_member;

CREATE TABLE member (
    member_id serial NOT NULL,
    last_name varchar(20) NOT NULL,
    first_name varchar(20) NOT NULL,
    email varchar(50) NOT NULL,
    phone varchar(10),
    birthday date NOT NULL,
    wants_reminder boolean NOT NULL,
    CONSTRAINT PK_member PRIMARY KEY(member_id)
);

CREATE TABLE interest_group (
    group_id serial NOT NULL,
    group_name varchar(30) NOT NULL,
    CONSTRAINT PK_interest_group PRIMARY KEY(group_id)
);

CREATE TABLE event (
    event_id serial NOT NULL,
    name varchar(30) NOT NULL,
    description varchar(200) NOT NULL,
    start_date timestamp NOT NULL,
    duration_minutes int NOT NULL,
    host_group int NOT NULL,
    CONSTRAINT PK_event PRIMARY KEY(event_id),
    CONSTRAINT FK_event_group FOREIGN KEY (host_group) REFERENCES interest_group (group_id)
);

CREATE TABLE event_member (
    event_id int NOT NULL,
    member_id int NOT NULL,
    CONSTRAINT FK_event_member_id FOREIGN KEY(event_id) REFERENCES event (event_id),
    CONSTRAINT FK_member_member_id FOREIGN KEY(member_id) REFERENCES member (member_id)
);

CREATE TABLE group_member (
    group_id int NOT NULL,
    member_id int NOT NULL,
    CONSTRAINT FK_group_member_group FOREIGN KEY (group_id) REFERENCES interest_group (group_id),
    CONSTRAINT FK_group_member_member FOREIGN KEY (member_id) REFERENCES member (member_id)
);

INSERT INTO member (last_name, first_name, email, phone, birthday, wants_reminder)
VALUES ('James', 'LeBron', 'theking@nbayoungboy.com', '3306662323','12/30/1984', true),
    ('Iverson', 'Allen', 'theanswer@nbayoungboy.com', '2153330000', '6/7/1975', false),
    ('Ball', 'LaMelo', 'BBB1@nbayoungboy.com', '9091112222', '8/22/2001', true),
    ('Jordan', 'Michael', 'jumpman23@ftk.com', '3121111111', '2/17/1963', true),
    ('Curry', 'Steph', 'splash@nbayoungboy.com', '3309393111', '3/14/1988', true),
    ('Lillard', 'Damian', 'blaze1@underdog.net', '9712222222', '7/15/1990', true),
    ('Durant', 'Kevin', 'DCboy@dc.net', '2023535357', '9/29/1988', true),
    ('ONeal', 'Shaquille', 'shaqdiesel@la.net', '3308888888', '3/6/1972', true);
SELECT * FROM member;

INSERT INTO event (name, description, start_date, duration_minutes, host_group)
VALUES ('Rings Event', 'A place where champions can connect.', '2023-06-12 06:30:00', 60, 1),
    ('Legends Event', 'A place where success is not measured by rings, but impact on the culture.', '2023-08-02 04:30:00', 60, 2),
    ('Practice', 'An event for practice and performance. Helpful tips to reach greatness', '2023-11-22 07:00:00', 40, 3),
    ('Goats Event', 'An event for goats only.', '2023-05-04 09:30:00', 30, 2);
SELECT * FROM event;

INSERT INTO interest_group (group_name)
VALUES ('The OGs'),
    ('The Legends'),
    ('New School');
SELECT * FROM interest_group;

INSERT INTO event_member (event_id, member_id)
VALUES (1, 1),
	(1, 4),
	(2, 1),
	(2, 2),
	(2, 4),
	(2, 8),
	(3, 3),
	(3, 6),
	(4, 1),
	(4, 4);
SELECT * FROM event_member;

INSERT INTO group_member (group_id, member_id)
VALUES (1, 6),
	(1, 7),
	(2, 1),
	(2, 2),
	(2, 4),
	(2, 8),
	(3, 3),
	(3, 5);
SELECT * FROM group_member;













