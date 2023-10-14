package edu.erickppn.metodos;

public class CriacaoMetodos {
    // Critério de nomeação de Métodos
    // Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos,
    // pois essas convenções facilitam a vida dos programadores ao trabalharem em
    // códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código
    // mais legível para nós e também para outras pessoas. Para métodos, os
    // critérios são:

    // Deve ser nomeado como verbo
    // Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da
    // primeira letra da segunda palavra).

    public void somar(int n1, int n2) {
    }

    public void abrirConexao() {
    }

    public void concluirProcessamento() {
    }

    public void findById(int id) {
    } // não se assuste, você verá muito método em inglês em sua jornada

    public void calcularImprimir() {
    } // há algo de errado neste método, ele deveria ter uma única finalidade

    // Mas, como sabemos a melhor forma de definir os métodos das nossas classes?
    // Para chegar à essa conclusão, somos auxiliados por uma convenção estrutural
    // para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

    // Qual a proposta principal do método? Você deve se perguntar constantemente
    // até compreender a real finalidade do mesmo.

    // Qual o tipo de retorno esperado após executar o método? Você deve analisar se
    // o método será responsável por retornar algum valor ou não.

    // Quais os parâmetros serão necessários para execução do método? Os métodos as
    // vezes precisam de argumentos como critérios para a execução.

    // O método possui o risco de apresentar alguma exceção? Exceções são comuns na
    // execução de métodos, as vezes é necessário prever e tratar a possível
    // existência de uma exceção.
    
    // Qual a visibilidade do método? Será necessário que o método seja visível a
    // toda aplicação, somente em mesmo pacotes, através de herança ou somente a
    // nível a própria classe.
}
