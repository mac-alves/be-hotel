# Api REST SpringBoot

## Rodar em uma maquina linux
* Passos a seguir:
```
	1 - Baixar o repositorio
	2 - Descompactar no local desejado
	3 - Entra na pasta do projeto
	4 - Abrir o terminal na pasta e rodar o seginte comando
		./mvnw spring-boot:run
```

* API ser��� executada em http://localhost:8080

## Requisitos
* Tenha uma instancia do mysql instalada na sua maquina
* Renomei o arquivo 
```
    src/main/resources/application-exemple.yml 
```
    para
```
    src/main/resources/application.yml 
```
* Crie um banco de dados chamado apirest_springboot
* Altere os dados de usuario e senha de acesso ao mysql no arquivo application.yml nas linhas 5 e 6 respectivamente.

## Endpoints
```
    GET - /funcionarios
    GET - /funcionarios/{id}
    POST - /funcionarios
    PUT - /funcionarios/{id}
    DELETE - /funcionarios/{id}
	
```

## Dados Necessarios para acriação de um funcionario
```
    {
        	"nome":"Nome",
        	"cpf":"345.345.345-65",
        	"dataNascimento":"23-54-1998",
        	"matricula":"34872",
        	"dataAdmissao":"23-56-1345",
        	"salario":12345.65,
        	"cargo":2,
        	"nivelAcesso":1
    }
	
```

* Obs: cargo e nivelAcesso são parametros enumerados:
```
    cargo:
        1 - ATENDENTE
	    2 - RECEPCIONISTA
	    3 - MALEIRO
	    4 - PORTEIRO
	    5 - ZELADOR
	    6 - GERENTE

    nivelAcesso:
        1 - ALPHA
	    2 - BETA
	    3 - GAMA
	    4 - PRISMA
```