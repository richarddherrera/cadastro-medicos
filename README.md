# 🩺 Vollmed Registry System

Uma API REST desenvolvida durante um treinamento prático com **Spring Boot**, com foco no **cadastro e gerenciamento de pacientes e médicos**. O sistema oferece operações completas de **CRUD** (Create, Read, Update, Delete), com boas práticas de desenvolvimento, versionamento de banco de dados e estrutura em camadas.

---

## 🚀 Tecnologias Utilizadas

![Java 17](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Spring Web](https://img.shields.io/badge/Spring_Web-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Flyway](https://img.shields.io/badge/Flyway-CC0200?style=for-the-badge&logo=flyway&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-F0022D?style=for-the-badge&logo=lombok&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

---

## 📂 Funcionalidades

- ✅ Cadastro de médicos e pacientes  
- 🔎 Listagem paginada e ordenada de registros  
- ✏️ Atualização de dados  
- 🗑️ Exclusão lógica (inativação de registros)

---

## 📚 O que foi aprendido

Durante o desenvolvimento deste projeto, pratiquei e aprimorei conhecimentos importantes, como:

- Criação de projetos com **Spring Initializr**
- Estruturação de pacotes em projetos Spring Boot
- Criação de **Controllers**, **Services** e **Repositories**
- Integração com banco de dados **MySQL**
- Mapeamento de entidades com **JPA**
- Aplicação de validações com Bean Validation
- Migrations automáticas com **Flyway**
- Boas práticas com **Lombok**
- Testes de endpoints com o **Postman**
- Padrões de projeto e princípios **RESTful**

---

## 🧩 Estrutura do projeto

```
src/
└── main/
    └── java/
        └── med.voll.api/
            ├── Controller/
            │   ├── HelloController
            │   ├── MedicoController
            │   └── PacienteController
            ├── DTO/
            │   ├── DadosAtualizacaoMedico
            │   ├── DadosAtualizacaoPaciente
            │   ├── DadosCadastroMedico
            │   ├── DadosCadastroPaciente
            │   ├── DadosEndereco
            │   ├── DadosListagemMedico
            │   └── DadosListagemPaciente
            ├── Entities/
            │   ├── Endereco
            │   ├── Medico
            │   └── Paciente
            ├── Enums/
            │   └── Especialidade
            ├── Repository/
            │   ├── MedicoRepository
            │   └── PacienteRepository
            └── ApiApplication
    └── resources/
        └── db.migration/
```

---

## ⚙️ Como executar o projeto

1. **Clone o repositório**

```bash
git clone https://github.com/richarddherrera/vollmed-registry-system.git
Configure o banco de dados MySQL

No arquivo src/main/resources/application-example.properties, insira as credenciais do seu banco local.

As migrations serão aplicadas automaticamente ao iniciar a aplicação.

Inicie o projeto

Via sua IDE (IntelliJ, Eclipse...) ou pelo terminal:

