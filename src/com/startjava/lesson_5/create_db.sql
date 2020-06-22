CREATE DATABASE Jaegers;

\c Jaegers;

CREATE TABLE Robots(
	id        SMALLSERIAL PRIMARY KEY,
	modelName TEXT,
	mark      CHAR(6),
	height    NUMERIC(4, 2),
	weight    NUMERIC(4, 3),
	status    VARCHAR(9),
	origin    VARCHAR(9),
	launch    DATE,
	kaijuKill INTEGER
);