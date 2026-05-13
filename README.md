# Meu Projeto



## Venda Service



Este serviço simula uma aplicação de vendas. Após a venda ser efetuada, ele atua como \*\*PRODUCER\*\* em um tópico específico criado por mim no Kafka.



No tópico, registro que a venda foi realizada e salvo o `id` do produto no canal do Kafka.


 <img width="1365" height="767" alt="image" src="https://github.com/jefflennon1/Tests-with-kafka/blob/master/images/venda-service.png?raw=true" /> 



\*\*Exemplo de chamada HTTP no endpoint que registra a venda:\*\*



<img width="1365" height="767" alt="image" src="https://github.com/jefflennon1/Tests-with-kafka/blob/master/images/chamada-http-venda.png?raw=true" /> 



\---



\## Estoque Service



Este serviço tem o papel de \*\*CONSUMER\*\* das mensagens registradas no canal (tópico) do meu broker Kafka.



Após capturar o evento de que a venda foi realizada, minha aplicação simula a regra de negócio de um estoque.


 
<img width="1365" height="767" alt="image" src="https://github.com/jefflennon1/Tests-with-kafka/blob/master/images/estoque-service.png?raw=true" /> 


\---



\## Visualização do Cluster Kafka



Abaixo, uma ferramenta visual do nosso cluster local criado (Offset Explorer):


<img width="1365" height="767" alt="image" src="https://github.com/jefflennon1/Tests-with-kafka/blob/master/images/offset-explorer.png?raw=true" /> 

