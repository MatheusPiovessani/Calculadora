# 🧮 Calculadora

Calculadora web desenvolvida com **Java Spring Boot** no backend e **HTML/CSS/JavaScript** no frontend, integrados via API REST.

---

## 🚀 Tecnologias

**Backend**
- Java 17
- Spring Boot 3.x
- Maven

**Frontend**
- HTML5
- CSS3
- JavaScript (Fetch API)

---

## ✨ Funcionalidades

- ➕ Adição
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão
- Suporte a números negativos
- Tratamento de erros (operação inválida, expressão vazia)

---

## 🗂️ Estrutura do Projeto

```
calculadora-api/
├── src/
│   └── main/
│       ├── java/br/dev/matheuspiovessani/calculadora_api/
│       │   ├── controller/
│       │   │   └── CalculadoraController.java   # Endpoint REST
│       │   ├── service/
│       │   │   └── CalculadoraService.java      # Lógica dos cálculos
│       │   ├── dto/
│       │   │   ├── CalculadoraRequest.java      # DTO de entrada
│       │   │   └── CalculadoraResponse.java     # DTO de saída
│       │   ├── exception/
│       │   │   └── GlobalExceptionHandler.java  # Tratamento de erros
│       │   └── Application.java
│       └── resources/
│           └── static/
│               ├── index.html   # Interface da calculadora
│               └── style.css    # Estilização
└── pom.xml
```

---

## 📡 API REST

**Endpoint:** `POST /calculadora`

**Request:**
```json
{
  "valor1": 10,
  "valor2": 5,
  "operacao": "+"
}
```

**Response:**
```json
{
  "resultado": 15.0
}
```

**Operações suportadas:** `+`, `-`, `*`, `/`

**Erros:**
- `400 Bad Request` — operação inválida

---

## ▶️ Como executar

### Pré-requisitos
- Java 17+
- Maven 3.8+

### Rodando a aplicação

```bash
# Clone o repositório
git clone https://github.com/MatheusPiovessani/Calculadora.git
cd Calculadora

# Execute a aplicação
./mvnw spring-boot:run
```

Acesse no navegador: [Calculadora](https://calculadora-projeto.up.railway.app/)

---

## 📌 Próximas melhorias

- [ ] Histórico de operações
- [ ] Operações avançadas (potência, raiz quadrada)
- [ ] Testes unitários
- [ ] Deploy em nuvem

---

## 👨‍💻 Autor

**Matheus Piovessani**  
[GitHub](https://github.com/MatheusPiovessani)
