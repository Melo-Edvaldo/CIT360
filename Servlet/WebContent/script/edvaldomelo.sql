CREATE TABLE  IF NOT EXISTS tbstudent(
  registration bigint NOT NULL,  
  name character varying(255),
  telephone character varying(255),  
  email character varying(255),
  registerdate date,
  CONSTRAINT tbstudent_pkey PRIMARY KEY (registration)
);