# Estruturas Condicionais em Java - Exemplos Simples e Compostas

Este projeto faz parte do curso de Java da DIO (Digital Innovation One) e demonstra exemplos básicos de controle de fluxo utilizando estruturas condicionais simples e compostas.

## Descrição dos Códigos

### 1. CaixaEletronico.java - Estrutura Condicional Simples

Este código simula um cenário simples de um caixa eletrônico, onde verificamos se é possível realizar um saque com base no saldo disponível. Utiliza uma estrutura condicional simples (`if`) sem um bloco `else`.

#### Funcionalidades

- **Verificação de Saldo**: O programa verifica se o valor do saque é menor que o saldo atual.
- **Atualização de Saldo**: Se a condição for atendida, o saldo é atualizado subtraindo o valor do saque.
- **Exibição do Resultado**: O saldo final é exibido no console.

#### Estrutura Condicional Utilizada

```java
if (valorSaque < saldo) {
    saldo = saldo - valorSaque;
}
```

- Se `valorSaque < saldo` for verdadeiro, o saque é realizado.
- Caso contrário, o saldo permanece inalterado (não há ação alternativa definida).

### 2. ResultadoEscola.java - Estrutura Condicional Composta

Este código simula a avaliação de um resultado escolar baseado em uma nota. Utiliza uma estrutura condicional composta (`if-else`) para decidir entre duas possibilidades.

#### Funcionalidades:

- **Avaliação da Nota**: O programa verifica se a nota é maior ou igual a 7.
- **Exibição do Resultado**: Imprime "Aprovado" se a condição for verdadeira, ou "Reprovado" caso contrário.

#### Estrutura Condicional Utilizada:

```java
if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

- Se `nota >= 7` for verdadeiro, exibe "Aprovado".
- Caso contrário, exibe "Reprovado".

## Como Executar

1. Certifique-se de ter o Java JDK instalado (versão 17 ou superior recomendada).

2. **Para CaixaEletronico.java**:
   - Compile: `javac -d bin src/CaixaEletronico.java`
   - Execute: `java -cp bin CaixaEletronico`

3. **Para ResultadoEscola.java**:
   - Compile: `javac -d bin src/ResultadoEscola.java`
   - Execute: `java -cp bin ResultadoEscola`

## Objetivo Educacional

Estes exemplos ilustram os conceitos fundamentais de controle de fluxo em programação:

- **Estrutura Simples**: Uso de `if` para executar código apenas se uma condição for verdadeira.
- **Estrutura Composta**: Uso de `if-else` para escolher entre duas ações baseadas em uma condição.

É uma introdução prática para entender como o código pode se comportar de forma diferente dependendo dos valores das variáveis, promovendo a lógica de decisão em programas Java.

## ️ Tecnologias

- Java SE 17
- Scanner (java.util)

## 3. ResultadoEscolaEncadeado.java - Estrutura Condicional Encadeada

Este código estende o exemplo anterior, adicionando um terceiro caso (`else if`) para tratar situações intermediárias de recuperação.

### Funcionalidades

- **Avaliação da Nota**: O programa verifica se a nota é maior ou igual a 7 (aprovado), maior ou igual a 5 (recuperação) ou menor que 5 (reprovado).
- **Exibição do Resultado**: Imprime "Aprovado", "Recuperação" ou "Reprovado" conforme a faixa de nota.

### Estrutura Condicional Utilizada

```java
if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}
```

- Primeiro teste (`nota >= 7`) decide aprovação.
- Se falso, o segundo teste (`nota >= 5`) decide recuperação.
- Caso ambos sejam falsos, o aluno é reprovado.

## 4. ResultadoEscolaTernaria.java - Operador Condicional Ternário

Este exemplo demonstra como usar o operador ternário para decisões simples em uma única expressão.

### Funcionalidades

- **Avaliação da Nota**: A variável `resultado` é atribuída usando um ternário aninhado que seleciona entre três mensagens.
- **Exibição do Resultado**: A mensagem é impressa diretamente.

### Estrutura Condicional Utilizada

```java
String resultado = (nota >= 7) ? "Aprovado"
                   : (nota >= 5) ? "Recuperação"
                   : "Reprovado";
```

- Condição principal testa aprovação; caso seja falsa, uma segunda condição decide entre recuperação ou reprovação.
- Tudo acontece em uma linha, mostrando como expressões podem substituir blocos `if`.

## 5. PlanoOperadoraIf.java - Estrutura Condicional Encadeada com if-else

Este código simula a seleção de planos de operadora de celular, demonstrando como usar uma cadeia de `if-else if-else` para escolher entre diferentes opções de plano.

### Funcionalidades

- **Seleção de Plano**: O programa verifica o plano escolhido ("B", "M" ou "T") e exibe os benefícios correspondentes.
- **Benefícios Acumulativos**: Cada plano superior inclui os benefícios do plano anterior.
- **Tratamento de Erro**: Caso o plano seja inválido, exibe uma mensagem de erro.

### Estrutura Condicional Utilizada

```java
if (plano.equals("B")) {
    System.out.println("100 minutos de ligação");
} else if (plano.equals("M")) {
    System.out.println("100 minutos de ligação");
    System.out.println("Whats e Instagram ilimitados");
} else if (plano.equals("T")) {
    System.out.println("100 minutos de ligação");
    System.out.println("Whats e Instagram ilimitados");
    System.out.println("5GB Youtube");
} else {
    System.out.println("Plano inválido");
}
```

- Primeiro verifica se é plano "B" (básico).
- Se não, verifica "M" (médio), que inclui benefícios do "B".
- Se não, verifica "T" (top), que inclui benefícios dos anteriores.
- Caso nenhum seja válido, exibe mensagem de erro.

## 6. PlanoOperadoraSwitch.java - Estrutura Switch com Fall-through

Este exemplo demonstra o uso da estrutura `switch` sem declarações `break`, resultando em comportamento de "fall-through" onde múltiplos casos são executados sequencialmente.

### Funcionalidades

- **Seleção de Plano**: Utiliza switch para avaliar o plano escolhido.
- **Fall-through Intencional**: Sem `break`, quando um caso é verdadeiro, os subsequentes também são executados.
- **Benefícios Acumulativos**: Demonstra como o fall-through pode ser usado para acumular benefícios.

### Estrutura Condicional Utilizada

```java
switch (plano) {
    case "T": {
        System.out.println("5GB Youtube");
    }
    case "M": {
        System.out.println("Whats e Instagram ilimitados");
    }
    case "B": {
        System.out.println("100 minutos de ligação");
    }
}
```

- Quando plano é "T", executa todos os casos (T, M, B).
- Quando plano é "M", executa M e B.
- Quando plano é "B", executa apenas B.
- Demonstra comportamento de fall-through para acumular benefícios.

## 7. SistemaMedida.java - Estrutura Condicional Encadeada Simples

Este código converte siglas de tamanhos ("P", "M", "G") para suas descrições completas em português, utilizando uma cadeia de `if-else if-else`.

### Funcionalidades

- **Conversão de Siglas**: Transforma abreviações em palavras completas.
- **Mapeamento Direto**: Cada sigla corresponde a uma única descrição.
- **Caso Padrão**: Trata siglas inválidas com "INDEFINIDO".

### Estrutura Condicional Utilizada

```java
if (sigla.equals("P")) {
    System.out.println("PEQUENO");
} else if (sigla.equals("M")) {
    System.out.println("MEDIO");
} else if (sigla.equals("G")) {
    System.out.println("GRANDE");
} else {
    System.out.println("INDEFINIDO");
}
```

- Testa cada sigla sequencialmente.
- Exibe a descrição correspondente ou "INDEFINIDO" se inválida.

## 8. SistemaMedidaSwitch.java - Estrutura Switch com Break

Este exemplo mostra a implementação correta de uma estrutura `switch` com declarações `break`, evitando o fall-through e garantindo que apenas o caso correspondente seja executado.

### Funcionalidades

- **Conversão de Siglas**: Mesma funcionalidade do SistemaMedida.java.
- **Execução Exclusiva**: Cada caso é executado independentemente.
- **Boa Prática**: Demonstra o uso adequado de `break` e `default`.

### Estrutura Condicional Utilizada

```java
switch (sigla) {
    case "P":
        System.out.println("PEQUENO");
        break;
    case "M":
        System.out.println("MEDIO");
        break;
    case "G":
        System.out.println("GRANDE");
        break;
    default:
        System.out.println("INDEFINIDO");
}
```

- Cada caso termina com `break`, executando apenas o correspondente.
- Caso `default` trata valores não previstos.

## Como Executar

1. Certifique-se de ter o Java JDK instalado (versão 17 ou superior recomendada).

2. **Compilação e execução geral** (substitua o nome do arquivo conforme o exemplo desejado):

   ```bash
   javac -d bin src/NomeDoArquivo.java
   java -cp bin NomeDoArquivo
   ```

   Onde `NomeDoArquivo` pode ser:
   - `CaixaEletronico`
   - `ResultadoEscola`
   - `ResultadoEscolaEncadeado`
   - `ResultadoEscolaTernaria`
   - `PlanoOperadoraIf`
   - `PlanoOperadoraSwitch`
   - `SistemaMedida`
   - `SistemaMedidaSwitch`

## Objetivo Educacional

Estes exemplos abrangem as principais formas de controle condicional em Java:

- **Condicional simples (`if`)**
- **Condicional composta (`if-else`)**
- **Condicional encadeada (`if-else if-else`)**
- **Operador ternário para expressões concisas**
- **Estrutura `switch` com fall-through**
- **Estrutura `switch` com `break` (boas práticas)**

São blocos fundamentais para construir lógica de decisão em programas Java, incluindo comparações entre `if-else` e `switch` para diferentes cenários.

## Próximos Passos

- Explore estruturas condicionais aninhadas (`if` dentro de `if`).
- Adicione validações adicionais, como verificar se os valores são positivos.
- Implemente estruturas `switch` para múltiplas condições.
- Combine condicionais com loops para cenários mais complexos.
- Manipulação de variáveis de diferentes tipos (`String`, `double`)
- Exibição formatada de mensagens com `System.out.println()`
- Leitura correta de diferentes tipos de dados com Scanner

## 🛠️ Tecnologias

- Java SE 17
- Scanner (java.util)

## 📚 Referência

Projeto desenvolvido como exercício da trilha DIO - Java Básico
