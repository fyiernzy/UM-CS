CREATE DATABASE lab9;

USE lab9;

CREATE TABLE Students
( StudentID VARCHAR(50) NOT NULL PRIMARY KEY,
  Name CHAR(50) NOT NULL
);

CREATE TABLE Scores
( ScoreID INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  StudentID VARCHAR(50) NOT NULL,
  Score1 INT NOT NULL,
  Score2 INT NOT NULL,
  Score3 INT NOT NULL,
  Score4 INT NOT NULL,
  Score5 INT NOT NULL,
  Score6 INT NOT NULL,
  Average FLOAT(6,1),
  Grade CHAR(50) NOT NULL,
  FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);

INSERT INTO Students VALUES
  ('WEK120001', 'Julie Smith'),
  ('WEK120002', 'Alan Wong'),
  ('WEK120003', 'Michelle Arthur'),
  ('WEK120004', 'Siti Fatimah'),
  ('WEK120005', 'Selvaretnam A/L Chandran'),
  ('WEK120006', 'Mohammad Abu');