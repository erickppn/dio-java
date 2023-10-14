# Aprendendo a Sintaxe Java ♨️

## Anatomia das classes

A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.

**Sintaxe de declaração de uma nova classe:**

<img src="https://github.com/digitalinnovationone/trilha-java-basico/raw/main/gitbook/.gitbook/assets/image%20(8)%20(1)%20(1).png" width="330px" style="border-radius: 14px; margin-left: 18px;" />

* 99,9% das nossas classes iniciarão com `public class;`
* Toda classe precisa de nome, exemplo `MinhaClasse;`
* O nome do arquivo deve ser idêntico ao nome da classe pública;
* Após o nome, definir o corpo `{ }` , onde iremos compor nossas classes com atributos e métodos.

[Conteúdo teórico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/gitbook/sintaxe/anatomia-das-classes.md)


## Tipos e variáveis

No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

Os oito tipos primitivos em Java são:

&#x20;int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos,  e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

---

### Declaração de Variáveis

Variável é uma identificação de um espaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

`<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>`

Exemplos abaixo:

```java
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
```

[Conteúdo teórico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/gitbook/sintaxe/variaveis.md)

## Operadores

Geralmente as primeiras palavras que ouvimos em um curso de programação são: um programa é um conjunto de instruções lógicas que, quando executadas, produzem algum resultado. Com isso em mente, ao começar a criar as primeiras linhas de código, logo você notará que é comum receber dados do usuário, prover alguma lógica para processá-los e então apresentar o resultado desse processamento.

<img src="https://github.com/digitalinnovationone/trilha-java-basico/raw/main/gitbook/.gitbook/assets/image%20(12)%20(1)%20(1)%20(1).png" width="330px" style="border-radius: 14px;" />

[Conteúdo teórico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/gitbook/sintaxe/operadores.md)

## Métodos

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a **funções** ou **sub-rotinas** disponíveis dentro de nossas classes.

Exemplos de declaração de métodos:

```java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
```

[Conteúdo teórico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/gitbook/sintaxe/metodos.md)

## Escopo

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi declarada**.&#x20;

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.&#x20;

[Conteúdo teórico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/gitbook/sintaxe/escopo.md)


## Java Doc

Uma das maiores características da linguagem Java é que desde suas primeiras versões tínhamos em nossas mãos uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar todos os recursos organizados por pacotes e classes bem específicas sem nem mesmo escrever uma linha de código.

[Conteúdo teórico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/gitbook/sintaxe/documentacao.md)

## Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE, já pensou nossos clientes tendo que instalar o Eclipse ou VsCode para rodar o sistema em sua empresa ?

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

No nosso caso iremos aprender como executar um programa Java via terminal como MS - DOS ou terminal do VsCode.

[Conteúdo teórico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/gitbook/sintaxe/terminal-e-argumentos.md)

---

<img src="https://hermes.digitalinnovation.one/certificates/cover/2BE79957.jpg" style="border-radius: 14px; max-width:500px" />

[Certificado de conclusão Aprendendo a Sintaxe Java](https://www.dio.me/certificate/2BE79957/share)