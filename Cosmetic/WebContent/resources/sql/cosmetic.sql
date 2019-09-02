--------------------------------------------------------
--  파일이 생성됨 - 토요일-8월-31-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table COSMETIC
--------------------------------------------------------

  CREATE TABLE "MADANG"."COSMETIC" 
   (	"C_ID" VARCHAR2(10 BYTE), 
	"C_NAME" VARCHAR2(100 BYTE), 
	"C_PRICE" NUMBER(*,0), 
	"C_DESCRIPTION" VARCHAR2(1000 BYTE), 
	"C_CATEGORY" VARCHAR2(100 BYTE), 
	"C_MANUFACTURER" VARCHAR2(100 BYTE), 
	"C_UNITSINSTOCK" NUMBER(*,0), 
	"C_FILENAME" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into MADANG.COSMETIC
SET DEFINE OFF;
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1001','Esteelauder double wear foundation',69000,'double wear stay-in-place SPF10/PA++','foundation','Estee lauder',1000,'c_1001.jpg');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1002','Benefit the porefessional primer',46000,'face cover','primary','benefit',500,'c_1002.jpg');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1003','nude peach',17000,'3ce mood recipe face blush','blusher','3ce',700,'c_1003.png');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1004','Mac lipstick',31000,'long lasting, moisturizing, soft and smooth texture','lipstick','MAC',100,'c_1004.jpg');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1005','Peripera ink the airy velvet',9000,'mlbb liptint','liptint','peripera',600,'c_1005.jpg');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1006','shu uemura hard formula',45000,'long and natural eyebrow pencil','eyebrow','Shu uemura',200,'c_1006.png');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1007','Bobbi brown eyeshadow',37000,'good pigmentation','eyeshadow','Bobbi brown',350,'c_1007.jpg');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1008','Clio waterproof penliner original',15000,'years','eyeliner','CLIO',800,'c_1008.jpg');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1009','kissme heroin make mascara ex',18000,'long and curl mascara','mascara','Kissme',900,'c_1009.jpg');
Insert into MADANG.COSMETIC (C_ID,C_NAME,C_PRICE,C_DESCRIPTION,C_CATEGORY,C_MANUFACTURER,C_UNITSINSTOCK,C_FILENAME) values ('c_1010','Luna pro photo finisher blur powder',28000,'special UV blocking agent','Fact','Luna',750,'c_1010.jpg');
--------------------------------------------------------
--  DDL for Index COSMETIC_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MADANG"."COSMETIC_PK" ON "MADANG"."COSMETIC" ("C_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table COSMETIC
--------------------------------------------------------

  ALTER TABLE "MADANG"."COSMETIC" ADD CONSTRAINT "COSMETIC_PK" PRIMARY KEY ("C_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "MADANG"."COSMETIC" MODIFY ("C_ID" NOT NULL ENABLE);
