
drop database if exists BestandPfefferminzia;
create database if not exists BestandPfefferminzia;
use BestandPfefferminzia;

CREATE TABLE Kunden (
    KundenID INT PRIMARY KEY,
    Vorname VARCHAR(50),
    Nachname VARCHAR(50),
    Geburtsdatum DATE,
    PLZ VARCHAR(10),
    Ort VARCHAR(30),
    Telefonnummer VARCHAR(20)
);

INSERT INTO Kunden (KundenID, Vorname, Nachname, Geburtsdatum, PLZ, Ort, Telefonnummer) VALUES
(101, 'Max', 'Mustermann', '1980-01-01', '12345', 'Musterstadt', '0123456789'),
(102, 'Anna', 'Müller', '1990-02-02', '23456', 'Beispielstadt', '1234567891'),
(103, 'Lukas', 'Schmidt', '2000-03-03', '34567', 'Dritteldorf', '2345678912'),
(104, 'Sarah', 'Fischer', '2010-04-04', '45678', 'Vierteldorf', '3456789123'),
(105, 'Paul', 'Wagner', '2020-05-05', '56789', 'Fünfteldorf', '4567891234'),
(106, 'Emma', 'Weber', '2030-06-06', '67890', 'Sechsteldorf', '5678912345'),
(107, 'Jonas', 'Meyer', '2040-07-07', '78901', 'Siebtedorf', '6789123456'),
(108, 'Lea', 'Schulz', '2050-08-08', '89012', 'Achtedorf', '7654321234567'),
(109, 'Felix', 'Hoffmann', '2060-09-09', '90123', 'Neuntedorf', '8912345678'),
(110, 'Marie', 'Schneider', '2070-10-10', '01234', 'Zehntendorf', '912345678');

CREATE TABLE Versicherungen (
    VersicherungsID INT PRIMARY KEY,
    Sparte VARCHAR(10),
    Tarif VARCHAR (20)
);

INSERT INTO Versicherungen (VersicherungsID, Sparte, Tarif) VALUES
(11, 'Haftpflicht', 'Standard'),
(12, 'Hausrat', 'Komfort'),
(13, 'Kfz', 'Vollkasko'),
(14, 'Reise', 'Premium'),
(15, 'Unfall', 'Top'),
(16, 'Berufsunfähigkeit', 'Exklusiv'),
(17, 'Lebensversicherung', 'Gold'),
(18, 'Private Krankenversicherung', 'Platin'),
(19, 'Rentenversicherung', 'Silber'),
(20, 'Investmentfonds', 'Diamant');

CREATE TABLE Versicherungsvertraege (
  VertragsID INT PRIMARY KEY,
  Vv_KundenID INT,
  Vv_VersicherungsID INT,
  Vertragsbeginn DATE,
  Vertragsende DATE,
  CONSTRAINT fk_KundenID FOREIGN KEY (Vv_KundenID) REFERENCES Kunden(KundenID),
  CONSTRAINT fk_VersicherungsID FOREIGN KEY (Vv_VersicherungsID) REFERENCES Versicherungen(VersicherungsID)
);
	
	

INSERT INTO Versicherungsvertraege (VertragsID, Vv_KundenID, Vv_VersicherungsID, Vertragsbeginn, Vertragsende) VALUES
(1, 101, 11, '2023-01-01', '2024-12-31'),
(2, 102, 12, '2023-02-02', '2025-01-31'),
(3, 103, 13, '2023-03-03', '2026-02-28'),
(4, 104, 14, '2023-04-04', '2027-03-31'),
(5, 105, 15, '2023-05-05', '2028-04-30'),
(6, 106, 16, '2023-06-06', '2029-05-31'),
(7, 107, 17, '2023-07-07', '2030-06-30'),
(8, 108, 18, '2023-08-08', '2031-07-31'),
(9, 109, 19, '2023-09-09', '2032-08-3'),
(10,110, 20, '2023-10-10', '2032-11-07');
