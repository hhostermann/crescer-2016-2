-- Gerado por Oracle SQL Developer Data Modeler 4.1.5.907
--   em:        2016-10-18 17:27:16 BRST
--   site:      Oracle Database 12c
--   tipo:      Oracle Database 12c




CREATE TABLE Candidato
  (
    IDCandidato    NUMBER NOT NULL ,
    NomeCompleto   VARCHAR2 (50) NOT NULL ,
    NomePopular    VARCHAR2 (50) NOT NULL ,
    DataNascimento DATE NOT NULL ,
    RegistroTRE    VARCHAR2 (30) NOT NULL ,
    FK_IDPartido   NUMBER (4) NOT NULL ,
    Foto           VARCHAR2 (120) NOT NULL ,
    NumeroEscolha  NUMBER (7) NOT NULL ,
    QuantidadeVoto NUMBER (10) NOT NULL ,
    Cargo_IDCargo  NUMBER
  ) ;
ALTER TABLE Candidato ADD CONSTRAINT Candidato_PK PRIMARY KEY ( IDCandidato ) ;


CREATE TABLE Cargo
  (
    IDCargo   NUMBER NOT NULL ,
    NomeCargo VARCHAR2 (20) NOT NULL
  ) ;
ALTER TABLE Cargo ADD CONSTRAINT Cargo_PK PRIMARY KEY ( IDCargo ) ;


CREATE TABLE Eleitor
  (
    IDEleitor       NUMBER NOT NULL ,
    NomeCompleto    VARCHAR2 (50) NOT NULL ,
    TituloEleitoral VARCHAR2 (12) ,
    RG              VARCHAR2 (10) NOT NULL ,
    DataNascimento  DATE NOT NULL ,
    Zona            VARCHAR2 (20) NOT NULL ,
    Secao           VARCHAR2 (10)
  ) ;
ALTER TABLE Eleitor ADD CONSTRAINT Eleitor_PK PRIMARY KEY ( IDEleitor ) ;


CREATE TABLE Partido
  (
    IDPartido             NUMBER NOT NULL ,
    NomePartido           VARCHAR2 (100) NOT NULL ,
    SiglaPartido          VARCHAR2 (10) NOT NULL ,
    Candidato_IDCandidato NUMBER NOT NULL
  ) ;
ALTER TABLE Partido ADD CONSTRAINT Partido_PK PRIMARY KEY ( IDPartido ) ;


CREATE TABLE Voto
  (
    DataVoto              DATE NOT NULL ,
    Candidato_IDCandidato NUMBER ,
    IDVoto                NUMBER NOT NULL ,
    Zona                  VARCHAR2 (10) NOT NULL ,
    Secao                 VARCHAR2 (10) NOT NULL
  ) ;
ALTER TABLE Voto ADD CONSTRAINT Voto_PK PRIMARY KEY ( IDVoto ) ;


ALTER TABLE Candidato ADD CONSTRAINT Candidato_Cargo_FK FOREIGN KEY ( Cargo_IDCargo ) REFERENCES Cargo ( IDCargo ) ;

-- Error - Foreign Key Eleitor_Voto_FK has no columns

ALTER TABLE Partido ADD CONSTRAINT Partido_Candidato_FK FOREIGN KEY ( Candidato_IDCandidato ) REFERENCES Candidato ( IDCandidato ) ;

ALTER TABLE Voto ADD CONSTRAINT Voto_Candidato_FK FOREIGN KEY ( Candidato_IDCandidato ) REFERENCES Candidato ( IDCandidato ) ;


-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             0
-- ALTER TABLE                              8
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- TSDP POLICY                              0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   1
-- WARNINGS                                 0
