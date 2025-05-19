# Conversor de Moedas em Java

Um aplicativo de console simples que converte valores entre diferentes moedas (Dólar, Real Brasileiro, Peso Argentino e Peso Colombiano) usando a API gratuita [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 🚀 Funcionalidades

- Busca as taxas de câmbio mais recentes para BRL (Real Brasileiro)  
- Converte valores entre:
  1. Dólar (USD) ↔ Peso Argentino (ARS)  
  2. Dólar (USD) ↔ Real Brasileiro (BRL)  
  3. Dólar (USD) ↔ Peso Colombiano (COP)  
- Menu interativo em console  
- Encerramento ao escolher a opção “Sair”

---

## 🛠️ Pré-requisitos

- Java 11 (ou superior)  
- [Gson 2.13.1](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.13.1/gson-2.13.1.jar)  

---

## 📂 Estrutura do Projeto


- **dependencies/**: dependências externas (JARs)  
- **src/main/Main.java**: classe principal que controla o menu e as conversões  
- **src/models/ConversionResponse.java**: modelo para desserialização da resposta JSON da API  

---

## ⚙️ Como Configurar

1. **Obtenha sua API Key**  
   - Cadastre-se em [ExchangeRate-API](https://www.exchangerate-api.com/) e copie sua chave (`API_KEY`).  

2. **Ajuste o código**  
   No arquivo `src/main/Main.java`, substitua a constante `API_KEY`:

   ```java
   // Antes:
   String API_KEY = "COLE-SUA-API-KEY-AQUI";

   // Depois:
   String API_KEY = "SUA_CHAVE_AQUI";

3. **Pronto para iniciar o projeto na classe Main**  
