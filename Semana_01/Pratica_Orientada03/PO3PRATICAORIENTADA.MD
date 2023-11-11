# PO3 - PRÁTICA ORIENTADA 
###### DESENVOLVER CONCEITOS INICIAIS DE PROGRAMAÇÃO EM JAVA
**O que é uma exceção em Java e qual é o propósito de usá-las em programas?**

Em Java, uma exceção é um evento que ocorre durante a execução de um programa, indicando que algo inesperado aconteceu. O propósito de usar exceções é lidar com essas situações inesperadas de maneira controlada. Em vez de interromper abruptamente o programa, as exceções permitem que você trate erros, forneça mensagens de erro significativas e tome medidas apropriadas para lidar com a situação, mantendo o controle do fluxo do programa.

Por exemplo, se você estiver lendo dados de um arquivo e ocorrer um erro de leitura, uma exceção pode ser lançada. Em vez de o programa quebrar, você pode capturar essa exceção e tomar medidas, como exibir uma mensagem de erro ou solicitar ao usuário que forneça um nome de arquivo válido.<hr>

**Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.** 

**Exceções Verificadas (Checked Exceptions):**

São exceções que o compilador exige que você lide explicitamente.
Geralmente, essas exceções representam condições que um programa pode razoavelmente esperar e lidar, como erros de entrada e saída (IOException) ou exceções de reflexão (ClassNotFoundException).
Exemplo:
    import java.io.File;
    import java.io.FileReader;
    import java.io.FileNotFoundException;
    
    public class ExemploExcecaoVerificada {
        public static void main(String[] args) {
            try {
                File arquivo = new File("arquivo.txt");
                FileReader leitor = new FileReader(arquivo);
                // Realizar operações de leitura
            } catch (FileNotFoundException e) {
                System.err.println("Arquivo não encontrado: " + e.getMessage());
            }
        }
    }
    

**Exceções Não Verificadas (Unchecked Exceptions):**

São exceções que o compilador não exige que você lide explicitamente.
Geralmente, essas exceções representam condições que indicam bugs no programa, como divisão por zero (ArithmeticException) ou acesso a índices inválidos em arrays (ArrayIndexOutOfBoundsException).
Exemplo:
```java
public class ExemploExcecaoNaoVerificada {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array[3]); // Isso causará ArrayIndexOutOfBoundsException
    }
}

```
Em resumo, as exceções verificadas são aquelas que o compilador força você a lidar, enquanto as exceções não verificadas são frequentemente relacionadas a erros de programação e o compilador não impõe a necessidade de tratá-las.<hr>
**Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?**

Em Java, podemos lidar com exceções usando blocos `try`, `catch`, `finally` e as palavras-chave associadas. Aqui estão algumas práticas comuns:

**try:**
```java
try {
    // Código que pode gerar uma exceção
}

```
**catch:** Capture exceções específicas usando blocos catch para lidar com elas.

```java
try {
    // gerar uma exceção
} catch (TipoDeExcecao e) {
    // tratar um exceção aqui
}

```
**finally:** Use um bloco finally para código que deve ser executado, independentemente de ocorrer uma exceção ou não.

```java
try {
    // código que pode gerar uma exceção
} catch (TipoDeExcecao e) {
    // trate a exceção aqui
} finally {
    // código a ser executado sempre
}

```
**Múltiplos catch:** Você pode ter vários blocos catch para lidar com diferentes tipos de exceções.

```java
try {
    // Código que pode gerar uma exceção
} catch (TipoDeExcecao1 e1) {
    // Trate a exceção do Tipo1
} catch (TipoDeExcecao2 e2) {
    // Trate a exceção do Tipo2
}

```
**throw e throws:** Use throw para lançar manualmente uma exceção, e throws na assinatura do método para indicar que ele pode lançar uma exceção.
```java
void meuMetodo() throws MinhaExcecao {
    // Código que pode lançar MinhaExcecao
    if (algumaCondicao) {
        throw new MinhaExcecao("Mensagem de erro");
    }
}

```
**Exceções não verificadas:** Para exceções não verificadas, como RuntimeExceptions, você geralmente não precisa declarar ou tratar explicitamente. Elas podem ser evitadas com uma boa prática de programação.<hr>
**O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?**

O bloco **try-catch** em Java é uma estrutura usada para lidar com exceções, permitindo que você escreva código que pode gerar exceções dentro de um bloco try e forneça um mecanismo para lidar com essas exceções usando um bloco catch.

**Como funciona:**

O código que pode gerar uma exceção é colocado dentro do bloco try.
Se uma exceção ocorrer dentro desse bloco, a execução do código dentro do bloco try é interrompida, e o controle é transferido para o bloco catch correspondente.
O bloco catch contém o código que será executado quando a exceção ocorrer, e ele especifica o tipo da exceção que está sendo tratada.

```java
try {
    // Código que pode gerar uma exceção
    int resultado = 10 / 0; // Isso gera uma ArithmeticException
} catch (ArithmeticException e) {
    // Tratamento da exceção
    System.out.println("Erro: Divisão por zero!");
}

```
**Por que é importante usá-lo:**

**Prevenção de quebras:** O uso do bloco try-catch impede que o programa seja encerrado abruptamente quando uma exceção ocorre. Isso ajuda a manter a estabilidade do programa.

**Tratamento controlado:** Permite que você trate exceções de maneira controlada, o que é vital para fornecer mensagens de erro significativas, realizar ações corretivas e manter a execução do programa quando possível.

**Melhor compreensão de erros:** Ao lidar com exceções, você pode fornecer informações detalhadas sobre o que deu errado, ajudando na depuração e na resolução de problemas.

**Manutenção do fluxo de controle:** O bloco try-catch permite que você mantenha o controle do fluxo do programa, executando o código apropriado mesmo quando ocorrem erros.

Em resumo, o **bloco try-catch** é fundamental para lidar com exceções de forma controlada, evitando quebras inesperadas do programa e permitindo um tratamento adequado de situações excepcionais.<hr>
**Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.**

Criar suas próprias exceções personalizadas em Java é apropriado quando você deseja representar situações específicas ou erros personalizados no seu código. Isso pode tornar o tratamento de exceções mais claro e específico, facilitando a identificação e o gerenciamento de problemas no seu programa.

A criação de exceções personalizadas envolve a criação de uma classe que estende a classe Exception ou uma de suas subclasses, como RuntimeException.

```java
class MinhaExcecaoPersonalizada extends Exception {
    public MinhaExcecaoPersonalizada(String mensagem) {
        super(mensagem);
    }
}

public class ExemploExcecaoPersonalizada {
    public static void main(String[] args) {
        try {
            throw new MinhaExcecaoPersonalizada("Isso é um erro específico do meu programa.");
        } catch (MinhaExcecaoPersonalizada e) {
            // Tratamento da exceção personalizada
            System.err.println("Erro personalizado: " + e.getMessage());
        }
    }
}

```
**Quando criar uma exceção personalizada:**

**Situações específicas:** Quando você encontra uma situação específica no seu programa que requer tratamento especial e que não é adequadamente representada por exceções Java padrão.

**Melhor semântica:** Para fornecer uma semântica mais clara sobre o que causou a exceção, facilitando a leitura do código e a depuração.

**Aprimoramento do design:** Para melhorar o design do seu sistema, tornando o tratamento de erros mais coeso e modular.
<hr>









