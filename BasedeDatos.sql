PGDMP     "    ,            
    x         	   registros    10.3    10.3 
    �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �
           1262    19341 	   registros    DATABASE     �   CREATE DATABASE registros WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Colombia.1252' LC_CTYPE = 'Spanish_Colombia.1252';
    DROP DATABASE registros;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            �
           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            �
           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    35727    Usuario    TABLE     �   CREATE TABLE public."Usuario" (
    "Nombre" character varying(25),
    "Apellido" character varying(25),
    "Telefono" integer,
    "TipoDocumento" character varying(10),
    "Documento" integer,
    "Id" integer NOT NULL
);
    DROP TABLE public."Usuario";
       public         postgres    false    3            �
          0    35727    Usuario 
   TABLE DATA               i   COPY public."Usuario" ("Nombre", "Apellido", "Telefono", "TipoDocumento", "Documento", "Id") FROM stdin;
    public       postgres    false    196   �       �
      x������ � �     