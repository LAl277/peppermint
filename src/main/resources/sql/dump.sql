
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
(1, 'Max', 'Mustermann', '1980-01-01', '12345', 'Musterstadt', '0123456789'),
(2, 'Anna', 'Müller', '1990-02-02', '23456', 'Beispielstadt', '0987654321'),
(3, 'Lukas', 'Schmidt', '2000-03-03', '34567', 'Dritteldorf', '0123456789'),
(4, 'Sarah', 'Fischer', '2010-04-04', '45678', 'Vierteldorf', '0987654321'),
(5, 'Paul', 'Wagner', '2020-05-05', '56789', 'Fünfteldorf', '0123456789'),
(6, 'Emma', 'Weber', '2030-06-06', '67890', 'Sechsteldorf', '0987654321'),
(7, 'Jonas', 'Meyer', '2040-07-07', '78901', 'Siebtedorf', '0123456789'),
(8, 'Lea', 'Schulz', '2050-08-08', '89012', 'Achtedorf', '0987654321'),
(9, 'Felix', 'Hoffmann', '2060-09-09', '90123', 'Neuntedorf', '0123456789'),
(10, 'Marie', 'Schneider', '2070-10-10', '01234', 'Zehntendorf', '0987654321');

CREATE TABLE Versicherungen (
    VersicherungsID INT PRIMARY KEY,
    Sparte VARCHAR(10),
    Tarif VARCHAR (20)
);

INSERT INTO Versicherungen (VersicherungsID, Sparte, Tarif) VALUES
(1, 'Haftpflicht', 'Standard'),
(2, 'Hausrat', 'Komfort'),
(3, 'Kfz', 'Vollkasko'),
(4, 'Reise', 'Premium'),
(5, 'Unfall', 'Top'),
(6, 'Berufsunfähigkeit', 'Exklusiv'),
(7, 'Lebensversicherung', 'Gold'),
(8, 'Private Krankenversicherung', 'Platin'),
(9, 'Rentenversicherung', 'Silber'),
(10, 'Investmentfonds', 'Diamant');

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
(1, 1, 1, '2023-01-01', '2024-12-31'),
(2, 2, 2, '2023-02-02', '2025-01-31'),
(3, 3, 3, '2023-03-03', '2026-02-28'),
(4, 4, 4, '2023-04-04', '2027-03-31'),
(5, 5, 5, '2023-05-05', '2028-04-30'),
(6, 6, 6, '2023-06-06', '2029-05-31'),
(7, 7, 7, '2023-07-07', '2030-06-30'),
(8, 8, 8, '2023-08-08', '2031-07-31'),
(9, 9, 9, '2023-09-09', '2032-08-3'),
(10,10,10, '2023-10-10', '2032-11-07');

