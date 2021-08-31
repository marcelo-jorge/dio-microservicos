## Construindo um projeto Java com arquitetura baseada em microsserviços usando Spring Cloud.



curso: Digital Inovation One

Bootcamp: Santander Full Stack Developer 2021

Aluno: Marcelo Bomfim

Linkedin: https://www.linkedin.com/in/marcelo-bomfim-977b3a109/



​	Neste projeto foi criado dois pequenos sistemas onde o objetivo era atraves da arquitetura de micro-serviços utilizar a mesma porta para varios serviços, evitando assim que o usuario tenha que se preocupar com essa questão.

### Tecnologias utilizadas conforme modulos:

* catalago de produto : Spring com base de dados no elasticsearch.
* carrinho de compras: Spring com base de dados no redis.
* servidor de descoberta: Sprind Cloud Eureka server.
* servidor de configuração: Spring Cloud Config.
* Gateway: Spring Cloud Gateway.

## Base de dados:

Neste exercicios utilizamos docker para subir as instancias de banco de dados.

elasticsearch versão 6.6.1 conforme comando abaixo:

`docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.6.2`

Redis versão 3.0.1 conforme comando abaixo:

`docker run --name redis -d -p 6379:6379 redis:3.0.1`



Acesso:

projeto no github: https://github.com/marcelo-jorge/dio-microservicos

arquivos de configuração: https://github.com/marcelo-jorge/ms-config