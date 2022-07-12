package OOP; // ! Cada pasta é um pacote

import java.util.Scanner;
import OOP.User; // ! Importando elementos de pacotes
import OOP.Validation;

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

        User admin = new User();

        admin.age = 34;
        admin.balance = 22445.45;
        admin.userName = "Victoria Luquet";
        admin.isAdmin = true;
        admin.salary = 2500;

        // ! Usando construtores
        // É invocado ao chamarmos a classe na hora de instancia-la
        // Inicialização de valores na instancia
        // Permitir/Obrigar que o objeto receba dados via injeção de dependencias (@)
        // * Toda classe tem um padrao, mas geralmente montamos o customizado (tipo C++)
        // * Podemos fornecer + de 1 construtor (sobrecarga)

        System.out.println(admin.getFullSalary());

        // ! Classe Object
        // Os objetos instanciados são do tipo da classe
        // Métodos
        // getClass -> retorna o tipo do objeto
        // equals(obj) -> compara se dois objetos são iguais
        // hashCode -> retorna codigo de hash do objeto
        // toString -> converte objeto para string (JSON)

        // Quando boto so o obj, o Java reconhece que quero printar, logo ele retorna a
        // string q o representa (toString)
        System.out.println(admin.toString());

        // ! Membros Estáticos de uma Classe
        // * Nao podemos chamar em metodos estaticos outros metodos que nao sao
        // estaticos

        // Aplicados em classes utilitárias (serviços e afins)
        // Declaração de constantes

        // Os valores em metodos estáticos, sao estaticos, ou seja, nao varia por
        // instancia pois esses metodos não são instanciados, mas são estaticos
    }
}
