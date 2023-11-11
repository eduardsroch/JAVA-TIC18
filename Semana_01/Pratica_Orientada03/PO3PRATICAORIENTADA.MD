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
   ``` java import java.io.File;
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
   ``` 

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
Em resumo, as exceções verificadas são aquelas que o compilador força você a lidar, enquanto as exceções não verificadas são frequentemente relacionadas a erros de programação e o compilador não impõe a necessidade de tratá-las.
