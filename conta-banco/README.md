# Conta Bancária - Terminal

Um programa Java simples que simula a criação de uma conta bancária através de uma interface de linha de comando (terminal).

## 📋 Descrição

Este projeto foi desenvolvido como parte da trilha Java básica da DIO. O programa solicita dados do cliente e exibe um resumo da conta criada.

## 🎯 Funcionalidades

- ✅ Leitura de entrada do usuário via Scanner
- ✅ Coleta de informações: número da conta, agência, nome do cliente
- ✅ Exibição formatada dos dados da conta criada

## 🚀 Como Executar

### Requisitos
- Java 17 ou superior
- Compilador Java (`javac`)

### Passos

1. **Compilar o projeto:**
   ```bash
   javac -d bin src/ContaTerminal.java
   ```

2. **Executar o programa:**
   ```bash
   java -cp bin ContaTerminal
   ```

3. **Forneça os dados solicitados:**
   - Número da conta
   - Número da agência
   - Nome do cliente

## 📂 Estrutura do Projeto

```
conta-banco/
├── README.md
├── bin/                    # Arquivos compilados (.class)
├── lib/                    # Bibliotecas externas
└── src/
    └── ContaTerminal.java  # Código-fonte principal
```

## 📝 Conceitos Aprendidos

- Importação da classe `Scanner` para leitura de entrada
- Manipulação de variáveis de diferentes tipos (`String`, `double`)
- Exibição formatada de mensagens com `System.out.println()`
- Leitura correta de diferentes tipos de dados com Scanner

## 💡 Exemplo de Execução

```
Digite o número da conta:
1234
Número da conta: 1234

Digite o número da agência:
0001
Número da agência: 0001

Digite o nome do cliente:
João Silva
Nome do cliente: João

Saldo da conta: 523.02
Olá João, obrigado por criar uma conta em nosso banco, sua agência é 0001, conta 1234 e seu saldo 523.02 já está disponível para saque.
```

## 🛠️ Tecnologias

- Java SE 17
- Scanner (java.util)

## 📚 Referência

Projeto desenvolvido como exercício da trilha DIO - Java Básico
