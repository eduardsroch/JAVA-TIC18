**DESENVOLVER CONCEITOS INICIAIS DE PROGRAMAÇÃO EM jAVA**

**1** - O que é uma classe em Java e qual é a diferença entre uma classe e um 
objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

Em Java, uma classe é um modelo para criar objetos. Ela define os atributos e comportamentos que todos os objetos desse tipo terão. Por exemplo, a `classe Circulo` define os `atributos raio` e `x` e o comportamento `calcularArea().`

A diferença entre uma classe e um objeto é que a classe é um modelo, enquanto o objeto é uma instância concreta da classe. Um objeto é criado a partir de uma classe, e ele possui todos os atributos e comportamentos definidos na classe.

5 exemplos de classes e objetos em C++ e Java:

**C++**

Classe `Circulo`:

```cpp
class Circulo {
  public:
    int raio;
    double x;
    double y;
    double calcularArea() {
      return 3.14 * raio * raio;
    }
};

```
Objeto `circulo`:

```cpp
Circulo circulo;
circulo.raio = 10;
circulo.x = 0;
circulo.y = 0;
cout << circulo.calcularArea() << endl;

```
Classe `Pessoa`:

```cpp
class Pessoa {
  public:
    string nome;
    int idade;
    string endereco;
    void imprimir() {
      cout << "Nome: " << nome << endl;
      cout << "Idade: " << idade << endl;
      cout << "Endereço: " << endereco << endl;
    }
};

```
Objeto `pessoa`:

```cpp
Pessoa pessoa;
pessoa.nome = "João da Silva";
pessoa.idade = 30;
pessoa.endereco = "Rua da Paz, 123";
pessoa.imprimir();

```
**Java**

Classe `Circulo`:

```java
public class Circulo {
  private int raio;
  private double x;
  private double y;

  public double calcularArea() {
    return 3.14 * this.raio * this.raio;
  }

  public void setRaio(int raio) {
    this.raio = raio;
  }

  public int getRaio() {
    return this.raio;
  }
}

```
Objeto `circulo`:

```java
Circulo circulo = new Circulo();
circulo.setRaio(10);
System.out.println(circulo.calcularArea()); // 314.159

```

Classe `Pessoa`:

```java
public class Pessoa {
  private String nome;
  private int idade;
  private String endereco;

  public void imprimir() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    System.out.println("Endereço: " + this.endereco);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }
}

```

Objeto `pessoa`:

```java
Pessoa pessoa = new Pessoa();
pessoa.setNome("João da Silva");
pessoa.setIdade(30);
pessoa.setEndereco("Rua da Paz, 123");
pessoa.imprimir();

```
<hr>
2 - Como você declara uma variável em Java e quais são os tipos de dados 
primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na 
linguagem C++.
 <br>
Para declarar uma variável em Java, usamos a seguinte sintaxe:
<br>

**JAVA**

```java
tipo_de_dado nome_da_variavel;

```
Onde tipo_de_dado é o tipo de dado que a variável irá armazenar e nome_da_variavel é o nome da variável.

Os tipos de dados primitivos mais comuns em Java são:

`int`: números inteiros
`double`: números de ponto flutuante
`char`: caracteres
`boolean`: valores lógicos
`String`: strings
<br>
Em C++, a sintaxe para declarar uma variável é semelhante:

```cpp
tipo_de_dado nome_da_variavel;

```
A diferença é que em C++ também podemos declarar variáveis com inicialização:

```cpp
tipo_de_dado nome_da_variavel = valor;
```

A seguinte declaração de variável em Java:

```java
int idade;
```
É equivalente à declaração de variável em C++:

```java
int idade;

```
A seguinte declaração de variável em Java:
```java
String nome = "João da Silva";

```
É equivalente à declaração de variável em C++:
```java
string nome = "João da Silva";

```
<hr>
3 - Explique o conceito de herança em Java e como você pode criar uma 
subclasse a partir de uma classe existente. Faça um paralelo com C++, 
apresentando 5 exemplos.<br>
A herança é um conceito de orientação a objetos que permite que uma classe herde os atributos e comportamentos de outra classe. A classe que herda é chamada de subclasse, e a classe que é herdada é chamada de superclasse.<br>
Para criar uma subclasse a partir de uma classe existente em Java:

```java
public class SubClasse extends SuperClasse {
  // atributos e comportamentos da subclasse
}

```
Por exemplo, a seguinte classe `Animal` é uma superclasse:
```java
public class Animal {
  public String nome;
  public int idade;
}

```
A classe `Cachorro` é uma subclasse de `Animal`:
```java
public class Cachorro extends Animal {
  public String raca;
  public boolean late;
}

```
A subclasse `Cachorro` herda os atributos `nome` e `idade` da superclasse `Animal`. Ela também adiciona os atributos `raca` e `late`.

O conceito de herança é semelhante em C++. Para criar uma subclasse a partir de uma classe existente em C++:
```cpp
class SubClasse : public SuperClasse {
  // atributos e comportamentos da subclasse
};

```
A classe Animal é uma superclasse:
```cpp
class Animal {
  public:
    string nome;
    int idade;
};

```
 A classe Cachorro é uma subclasse de Animal:
```cpp
class Cachorro : public Animal {
  public:
    string raca;
    bool late;
};

```
A subclasse `Cachorro` herda os atributos `nome` e `idade` da superclasse `Animal`. Ela também adiciona os atributos `raca` e `late`.

**Exemplos de herança em Java e C++:**

**Java**

**Exemplo 1**: Uma subclasse de `Pessoa` que representa um `Estudante`. A subclasse Estudante herda os atributos `nome`, `idade` e `endereco` da superclasse `Pessoa`, e adiciona o atributo `curso`.
```java
public class Estudante extends Pessoa {
  public String curso;
}

```
**Exemplo 2**: Uma subclasse de` Veiculo` que representa um `Carro`. A subclasse `Carro` herda os atributos `marca`, modelo e ano da superclasse `Veiculo`, e adiciona os atributos `cor` e `potencia`.
```java
public class Carro extends Veiculo {
  public String cor;
  public int potencia;
}

```
**Exemplo 3**: Uma subclasse de `FiguraGeometrica` que representa um `Retangulo`. A subclasse `Retangulo` herda os atributos `largura` e `altura `da superclasse `FiguraGeometrica`, e adiciona o atributo `cor`.

**C++**
**Exemplo 1**: Uma subclasse de `Person` que representa um `Student`. A subclasse `Student` herda os atributos `name`, `age` e `address` da superclasse `Person`, e adiciona o atributo `course`.
```C++
class Student : public Person {
  public:
    string course;
};

```
**Exemplo 2**: Uma subclasse de `Vehicle` que representa um `Car`. A subclasse `Car` herda os atributos `brand`,` model` e `year` da superclasse `Vehicle`, e adiciona os atributos `color` e `power`.
```cpp
class Car : public Vehicle {
  public:
    string color;
    int power;
};

```
**Exemplo 3**: Uma subclasse de GeometricFigure que representa um Rectangle. A subclasse Rectangle herda os atributos width e height da superclasse GeometricFigure, e adiciona o atributo color.
```cpp
class Rectangle : public GeometricFigure {
  public:
    string color;
};

```
> A herança é uma ferramenta poderosa que pode ser usada para reusar código e simplificar o design de sistemas de software. É um conceito importante da orientação a objetos que deve ser compreendido por qualquer desenvolvedor de software.







