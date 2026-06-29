# 🧮 Calculadora API

Uma API REST desenvolvida em Java com o framework Spring Boot voltada para o aprendizado prático em grupo. O projeto realiza operações matemáticas básicas e possui um endpoint de Health Check para validação do status da aplicação em tempo real.

---

## 📝 Descrição do Projeto

O objetivo principal deste projeto é servir como base didática para o desenvolvimento backend com Spring Boot. A API foi estruturada seguindo o padrão arquitetural de camadas (MVC), garantindo a separação de responsabilidades: os controladores (Controllers) gerenciam as rotas e respostas HTTP, enquanto as regras de negócio e lógicas de dados são processadas isoladamente nas classes de serviço (Services).

A aplicação conta com validações importantes (como o tratamento para impedir divisões por zero) e um monitoramento simples de integridade que exibe o estado atual da API e o carimbo de data/hora dinâmico do servidor.

---

## 🛠️ Tecnologias Utilizadas

* Java 21 (LTS)
* Spring Boot 3.x
* Maven (Gerenciador de Dependências)

---

## 🚀 Como Rodar o Projeto Localmente (Passo a Passo)

Este guia foi feito para que qualquer pessoa consiga rodar o projeto do zero de forma simples.

### Pré-requisitos
Antes de começar, você precisará ter instalado em sua máquina:
* JDK 21 (Kit de Desenvolvimento Java)
* Git (Para clonar o repositório)
* Uma IDE de sua preferência (Recomendado: IntelliJ IDEA)

### Passo 1: Clonar o Repositório
Abra o terminal do seu computador e execute o comando abaixo para baixar o código:
git clone <URL_DO_SEU_REPOSITORIO_AQUI>

### Passo 2: Abrir na IDE
1. Abra o IntelliJ IDEA.
2. Clique em Open (Abrir) e selecione a pasta do projeto calculadora-api.
3. Aguarde alguns minutos. A IDE irá identificar o arquivo pom.xml automaticamente e começará a baixar as dependências do Maven. Uma barra de progresso aparecerá no canto inferior direito.

### Passo 3: Executar a Aplicação
1. No painel de arquivos do lado esquerdo, navegue até o caminho: src/main/java/com/grupoestudos/calculadora_api/
2. Localize o arquivo chamado CalculadoraApiApplication.java.
3. Clique com o botão direito nele e selecione Run 'CalculadoraApiApplication' (ou clique no ícone do "Play" verde).
4. Se tudo estiver correto, o console exibirá o logo do Spring e a mensagem informando que o servidor iniciou com sucesso. A API estará respondendo localmente em: http://localhost:8080

---

## 🛣️ Endpoints Disponíveis & Exemplos

### 📊 Operações Matemáticas
O prefixo base para todas as operações da calculadora é /calcular. Elas exigem os parâmetros a e b informados diretamente na URL da requisição.

* Soma (GET): http://localhost:8080/calcular/soma?a=10&b=5
  Retorno: {"Resultado": 15.0}

* Subtração (GET): http://localhost:8080/calcular/subtracao?a=12&b=4
  Retorno: {"Resultado:": 8.0}

* Multiplicação (GET): http://localhost:8080/calcular/multiplicacao?a=3&b=7
  Retorno: {"resultado": 21.0}

* Divisão (GET): http://localhost:8080/calcular/divisao?a=20&b=2
  Retorno: {"resultado": 10.0}

Nota de Validação: Caso tente realizar uma divisão por zero (b=0), a API retornará o código HTTP 400 Bad Request com o corpo: {"erro": "Não é possível dividir por zero"}.

### 🔍 Status da Aplicação (Health Check)
Verifica a saúde do servidor. Toda a lógica de criação e formatação do objeto é processada na camada de serviço.

* Método: GET
* Rota: /calcular/status
* Exemplo de Chamada: http://localhost:8080/calcular/status
* Retorno de Sucesso (HTTP 200 OK):
  {
  "status": "online",
  "mensagem": "API da Calculadora está funcionando!",
  "horario": "2026-06-29T01:21:48.123456"
  }

---

## 🧪 Como Testar via Postman (Importando a Collection)

Todas as requisições listadas acima foram testadas e validadas.

📥 [Clique aqui para baixar a Collection do Postman](./Calculadora API.postman_collection.json)

1. Abra o Postman.
2. No canto superior esquerdo, clique no botão Import (Importar).
3. Selecione o arquivo que você baixou ou busque-o diretamente na raiz deste projeto.