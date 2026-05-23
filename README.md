# 📚 Gerenciamento de Alunos com Pilha

Projeto acadêmico desenvolvido para a disciplina de **Programação Orientada a Objetos** da **UNIFACISA**. O sistema gerencia alunos utilizando a estrutura de dados **Pilha** (LIFO) implementada com **vetor fixo** (array), conforme os requisitos da atividade.

---

## 🚀 Funcionalidades

- **Adicionar aluno** – insere um novo aluno no topo da pilha.
- **Remover aluno** – remove o aluno do topo da pilha (último adicionado).
- **Buscar aluno por matrícula** – localiza um aluno a partir do seu número de matrícula.
- **Listar todos os alunos** – exibe todos os alunos cadastrados (do primeiro ao topo).
- **Contar alunos** – mostra a quantidade total de alunos na pilha.

Todas as operações utilizam **vetor** (`Aluno[]`) e seguem o comportamento de uma pilha.

---

## 🧱 Estrutura do Projeto

    src/
    ├── model/
    │ └── Aluno.java # Classe que representa o aluno (nome, matrícula, curso)
    ├── estrutura/
    │ └── PilhaAluno.java # Implementação da pilha com vetor (push, pop, buscar, listar, contar)
    └── view/
    └── Main.java # Interface com o usuário (menu interativo com JOptionPane)


---

## 🛠️ Tecnologias Utilizadas

- **Java 17** (ou superior)
- **JOptionPane** (interface gráfica simples)
- **Git** para controle de versão
- **IntelliJ IDEA**

---

## ▶️ Como Executar

### 🐧 Linux / WSL / 🪟 Windows (Git Bash)

### 🪟 No Windows (com Git Bash ou Prompt)

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/rubensnuness/GerenciamentoAlunos.git
   ```
2. **Navegue até a pasta do código**:
   ```bash
   cd GerenciamentoAlunos/src
   ```
3. **Compile todos os arquivos**:
   ```bash
   javac model/*.java estrutura/*.java view/Main.java
   ```
4. **Execute**:
   ```bash
   java view.Main
   ```

## 📌 Exemplo de Uso

        --- PILHA DE ALUNOS ---
        1 - Adicionar aluno
        2 - Remover aluno
        3 - Buscar aluno por matrícula
        4 - Listar todos
        5 - Contar alunos
        6 - Sair

### Adicionar aluno:
    Nome: João Silva
    
    Matrícula: 2024001
    
    Curso: ADS

### Listar alunos:
    --- LISTA DE ALUNOS ---
    Nome: João Silva | Matrícula: 2024001 | Curso: ADS

### Remover aluno:
    O último aluno adicionado é removido automaticamente (comportamento da pilha).

### Buscar aluno por matrícula:
    Digitar 2024001 → exibe os dados do aluno correspondente.
---
## 🧪 Validações Implementadas
* Capacidade máxima da pilha: 10 alunos (vetor fixo).

* Impede adicionar quando a pilha está cheia.

* Impede remover quando a pilha está vazia.

* Campos obrigatórios (nome, matrícula, curso) não podem ficar vazios.

* Tratamento de entradas inválidas (cancelamento, valores não numéricos).
---
## 👤 Autores
### Rubens Nunes de Almeida – [GitHub](https://github.com/rubensnuness)
### Jhon Everthon Negreiros Santiago

### Trabalho acadêmico – UNIFACISA Disciplina: Programação Orientada a Objetos