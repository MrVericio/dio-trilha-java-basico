# Controle de Fluxo em Java - Exemplo Simples de Condicional

Este projeto faz parte do curso de Java da DIO (Digital Innovation One) e demonstra um exemplo básico de controle de fluxo utilizando estruturas condicionais simples.

## Descrição do Código

O código implementado simula um cenário simples de um caixa eletrônico, onde verificamos se é possível realizar um saque com base no saldo disponível.

### Funcionalidades

- **Verificação de Saldo**: O programa verifica se o valor do saque é menor que o saldo atual.
- **Atualização de Saldo**: Se a condição for atendida, o saldo é atualizado subtraindo o valor do saque.
- **Exibição do Resultado**: O saldo final é exibido no console.

### Estrutura Condicional Utilizada

O código utiliza uma estrutura `if` simples para controlar o fluxo:

```java
if (valorSaque < saldo) {
    saldo = saldo - valorSaque;
}
```

- Se `valorSaque < saldo` for verdadeiro, o saque é realizado.
- Caso contrário, o saldo permanece inalterado.

## Como Executar

1. Certifique-se de ter o Java JDK instalado (versão 17 ou superior recomendada).
2. Compile o código:
   ```
   javac -d bin src/CaixaEletronico.java
   ```
3. Execute o programa:
   ```
   java -cp bin CaixaEletronico
   ```

## Objetivo Educacional

Este exemplo ilustra o conceito fundamental de controle de fluxo em programação, especificamente o uso de condicionais para tomar decisões baseadas em condições lógicas. É uma introdução prática para entender como o código pode se comportar de forma diferente dependendo dos valores das variáveis.

## Próximos Passos

- Explore estruturas condicionais mais complexas, como `if-else` e `switch`.
- Adicione validações adicionais, como verificar se o valor do saque é positivo.
- Implemente loops para simular múltiplas operações.
