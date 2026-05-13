\# Meu Projeto



\## Venda Service



Este serviço simula uma aplicação de vendas. Após a venda ser efetuada, ele atua como \*\*PRODUCER\*\* em um tópico específico criado por mim no Kafka.



No tópico, registro que a venda foi realizada e salvo o `id` do produto no canal do Kafka.



!\[Arquitetura do Venda Service](images/venda-service.png)



\*\*Exemplo de chamada HTTP no endpoint que registra a venda:\*\*



!\[Chamada HTTP para registro de venda](images/chamada-http-venda.png)



\---



\## Estoque Service



Este serviço tem o papel de \*\*CONSUMER\*\* das mensagens registradas no canal (tópico) do meu broker Kafka.



Após capturar o evento de que a venda foi realizada, minha aplicação simula a regra de negócio de um estoque.



!\[Arquitetura do Estoque Service](images/estoque-service.png)



\---



\## Visualização do Cluster Kafka



Abaixo, uma ferramenta visual do nosso cluster local criado (Offset Explorer):



!\[Offset Explorer](images/offset-explorer.png)

