SET MODE Oracle;

CREATE SCHEMA IF NOT EXISTS BST_ISE_SCH01;

CREATE TABLE BST_ISE_SCH01.REC_GSP_PRC_SKU
  (
    ID         NUMBER NOT NULL ,
    DEVICE_TYP VARCHAR2(20) NOT NULL ,
    TERM       NUMBER(2,0) NOT NULL ,
    MIN_PRC    NUMBER(10,0) NOT NULL ,
    MAX_PRC    NUMBER(10,0) NOT NULL ,
    RTL_PRC    NUMBER(10,0) NOT NULL ,
    SKU        VARCHAR2(20) NOT NULL 
    );
    

ALTER TABLE BST_ISE_SCH01.REC_GSP_PRC_SKU 
    ADD CONSTRAINT REC_GSP_PRC_SKU_PK PRIMARY KEY ( ID ) ;
