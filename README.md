# Zipcode consult project

## Task
- Build an **API** with two endpoints:
	- One `endpoint` using **GET** methof=d
		- Get `data` of an address through `cep (zipcode)` 
		- In case of don't have the date in the database make a query on **`www.viacep.com.br`**
	- One `endpoint` using **POST** method
		- Receive `data` of an address and save in **MongoDB** database

---

## Route [GET]

- [GET] `http://{host-url}/api/cep/00000000`

#### Response:    
	{
		"id": "",
		"cep": "",
		"logradouro": "",
		"complemento": "",
		"bairro": "",
		"localidade": "",
		"uf": "",
		"unidade": "",
		"ibge": ""
	}    

## Route [POST]

- [POST] `http://{host-url}/api/cep`

#### Body
    {
    	"cep": "",
    	"logradouro": "",
    	"complemento": "",
    	"bairro": "",
    	"localidade": "",
    	"uf": "",
    	"unidade": "",
    	"ibge": ""
    }


#### Response    
	{
		"id": "",
		"cep": "",
		"logradouro": "",
		"complemento": "",
		"bairro": "",
		"localidade": "",
		"uf": "",
		"unidade": "",
		"ibge": ""
	}

---

## Requirements

- [x] Version: Java 8;
- [x] Spring Boot;
- [x] Mongo;
- [x] Lombok;
- [x] DTO;
- [x] Collections;
- [x] Lambdas;
- [x] Divide into service;
- [x] Swagger;
- [x] Actuator;
- [x] Service and endpoints tests;