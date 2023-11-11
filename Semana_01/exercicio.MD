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
**2** - Como você declara uma variável em Java e quais são os tipos de dados 
primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na 
linguagem C++.





