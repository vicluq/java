package OOP; // ! Cada pasta é um pacote

import java.util.Scanner;
import OOP.User; // ! Importando elementos de pacotes
import OOP.Validation;
import OOP.Admin;

/* 
    NOTE Classes

    - Atributos (propriedades) e Métodos (executam funções)
    - Recursos: construtores, sobrecarga, encapsulamento, herança e polimorfismo
    - Toda classe é uma subclasse da outra
*/

public class OOP {
    public static void main(String[] args) {
        System.out.println("This is object orientation!");

        // ! Criando Classes

        // * [privacidade] [static] class [class_name] {}

        // Se a classe esta aqui numa classe publica/privada, etc, não faz sentido
        // definir ela como publica

        // Se fossemos mover ela para seu proprio arquivo, ai sim, usariamos public,
        // private etc

        // Criando a classe User em outro arquivo, nos teríamos que identificar essa
        // keyword

        // Quando criamos objetos, a memória associada é a dinâmica, logo, está na heap
        // O nome referente ao objeto, contém o endereço que faz ref ao elemento na Heap

        // ! ex:
        // class User {
        // // Atributos
        // public String userName;
        // public int age;
        // public double balance;
        // }

        // ! Instanciando Objetos
        // Keyword new e o invocamento da classe (o type da variavel deve ser o da
        // classe)

        if (Validation.validateEmail("victoria.tewari@gmail.com")) {
            // ... do something
        }

        /*
         * Criando sem construtor (errado)
         * User admin = new User();
         * 
         * admin.age = 34;
         * admin.balance = 22445.45;
         * admin.userName = "Victoria Luquet";
         * admin.isAdmin = true;
         * admin.salary = 2500;
         */

        // ! Usando construtores
        // É invocado ao chamarmos a classe na hora de instancia-la
        // Inicialização de valores na instancia
        // Permitir/Obrigar que o objeto receba dados via injeção de dependencias (@)
        // * Toda classe tem um padrao, mas geralmente montamos o customizado (tipo C++)
        // * Podemos fornecer + de 1 construtor (sobrecarga)
        // * Criando o construtor: deve ter o mesmo nome da classe (c++) e ser publico
        // ne pq n faz sentido ser privado KK
        // ? Protege o objeto, pois agora podemos tornar os atributos delicados como
        // privados e evitar inconsistencias

        User myUser = new User("Victoria", 20, 600.45, 2500.0);

        System.out.println(myUser.getFullSalary());

        // ! This
        // Faz referencia ao objeto que sera instanciado pela classe
        // Podemos passar o this (o objeto em questao) como argumento para outros
        // metodos/funcoes

        // ! Sobrecarga
        // Operações com o mesmo nome, porem com parametros diferentes
        // É escolhida a operação que condiz com os parametros

        // ! Classe Object
        // Os objetos instanciados são do tipo da classe
        // Métodos
        // getClass -> retorna o tipo do objeto
        // equals(obj) -> compara se dois objetos são iguais
        // hashCode -> retorna codigo de hash do objeto
        // toString -> converte objeto para string (JSON)

        // Quando boto so o obj, o Java reconhece que quero printar, logo ele retorna a
        // string q o representa (toString)
        System.out.println(myUser.toString());

        // ! Membros Estáticos de uma Classe
        // * Nao podemos chamar em metodos estaticos outros metodos que nao sao
        // estaticos

        // Aplicados em classes utilitárias (serviços e afins)
        // Declaração de constantes

        // Os valores em metodos estáticos, sao estaticos, ou seja, nao varia por
        // instancia pois esses metodos não são instanciados, mas são estaticos

        // ! Encapsulamento
        // Esconder alguns detalhes da implementação da classe para manter o objeto
        // consistente
        // * Expor apenas operações seguras
        // ? O Objeto NAO deve expor nenhum atributo [PRIVATE]
        // Acessar atributos usando Getters e Setters (Métodos)

        // ! Referencia
        // Obj sao passados por referencia, logo se atribuo um obj a outro, ele recebe a
        // ref ao obj
        // nunca são passados como parametro, mas sim, como referencia e essa referencia
        // é passada por valor

        Admin adminUser = new Admin("Victoria Luquet", 21, 20000, 12000);

        System.out.println(adminUser.userName + " - " + adminUser.getBalance());
        adminUser.referenceTest(adminUser);
        System.out.println(adminUser.userName + " - " + adminUser.getBalance());
        // O valor foi alterado pois o obj é passado por referencia

        // ! Testes de Herança
        User newUser = new Admin("Victoria Luquet", 21, 20000, 12000);
        // Isso pode acontecer, pois, todo Admin é User já que é subtipo de User

        // * Para usarmos metodos de da SUB, devemos fazer um cast
        // newUser.addModeratorBonus() -> nao funciona
        ((Admin) newUser).addModeratorBonus(300);

        // * Fazer Admin otherUser = newUser NAO funciona pois nem todo User é admin
        // ? Para garantir que newUser é instancia de Admin: instanteof e fazer o cast
        Admin otherUser;
        if (newUser instanceof Admin) {
            otherUser = (Admin) newUser;
        }

        // * Ligação Dinamica
        // Quando chamamos o metodo de uma sub classe cujo nome é igual ao de uma sup acima, o java
        // nao olha pro tipo da variável, mas sim, pra classe que gerou a instancia do obj
        // Se admim e user tivessem medotos iguais, no exemolo acima, se eu chamasse, iria exec o de admin 
    }
}
