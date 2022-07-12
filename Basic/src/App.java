import java.util.Locale; // para configurar e mudar o Locale do Java
import java.util.Scanner; // para configurar entrada de dados

public class App {

  public static void main(String[] args) {
    // How to print to console:  System.out.println
    System.out.println("Primeiro com Javinha (um cu pra config)");

    // ! Variáveis e Tipos
    // int -> inteiros (4bytes)
    // long -> inteiros maiores (8bytes)
    // byte -> inteiro de 1 byte
    // short -> inteiro de 2 byte
    // boolean -> 1 ou 0 (1 bit)
    // doube -> ponto flutuante com mais precisao (8bytes)
    // float -> ponto flutuante (4bytes)
    // char -> um caracter (2 bytes em Java) em unicode
    // String -> ja entra em OOP, cadeia de char
    // final [Type] -> constante

    double salario = 2500.45;
    int duracao_contrato = 5;

    double total_ganho = salario * duracao_contrato;

    boolean isLogged = true;

    // ! Saída de dados

    // Três Funções
    System.out.println("Saida com o println"); // Tem \n no fim e podemos concatenar
    
    System.out.print("Saida com o print!\n"); // Não tem \n no fim e podemos concatenar

    System.out.printf("Saida com o printf!\n"); // F de FORMATADO (string formatada)

    // Printando variáveis
    System.out.print(total_ganho);

    // String formatada (o printf pega a puntuação de acordo com o formato do PC - PT-BR/Eng)
    System.out.printf("\nTotal: %.2f\n", total_ganho);

    // Metodo String.format("formatacao de printf", string)
    
    // ! Mudando o Locale do Java
    // Isso é importante pra entrada de dadosß
    Locale.setDefault(Locale.US);
    System.out.printf("Total: %.2f\n", total_ganho);

    // Concatenação de elementos (print e println)
    System.out.print("O user está logado: " + isLogged + "\n");
    System.out.println("O salario é = " + salario + "\n");

    // Resumo: printf é igual a C e os outros dois são a moda JS

    
    // ! Entrada

    // * Objeto scanner
    Scanner data_entry = new Scanner(System.in);

    // * Lendo string
    String name = data_entry.next(); // Lê até espaço 
    String compliment = data_entry.nextLine(); // Lê até quebra de linha

    // * Lendo char (o type retornado é string, logo usamos charAt(0))
    char caracter = data_entry.next().charAt(0);

    // ! Lendo outros tipos - next<Type>()
    double coins = data_entry.nextDouble();

    // OBS: qubra de linha pendente (le normal e depois usa nextLine)
    // Ao pegar um valor normalmente e apertar enter p confirmar, o \n fica pendente no buffer e o nextline consome ela
    // Basta dar outro nextLine extra antes do que queremos dar para pegar o conteúdo

    // Quando não precisarmos mais
    data_entry.close();
    

    // ! Processamento de Dados e Casting
    // Atribuições -> normal
    
    // Casting (igual a C)
    float value = (float) salario;  


    // ! Funções Math.sqrt, pow,abs,  etc
    double solution = Math.sqrt(Math.pow(5, 7));

  }
}
