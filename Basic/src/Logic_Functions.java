public class Logic_Functions {
    public static void main(String[] args) {
        // ! Condicionais

        // As expressões lógicas e comparativas são iguais a C
        // A estrutura dos condicionais são iguais
        // Switch case é igual
        // Ternário é igual a JS e C

        int age = 32, permission = 3;

        if(age > 20 && permission != 0) {
            System.out.println("User has correct age and permisson");
        } 
        else if (age <= 20 && age >= 18 && permission == 2) {
            System.out.println("User is young talent");
        }
        else {
            System.out.println("User has no correct age and/or permisson");
        }

        // ! Estruturas Repetitivas

        // * O While, for, do/while são iguais

        // * For each - Iteráveis (lembra o de CPP)
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23};

        for(int prime: primes) { 
            // ... Do something
        }

        // ! Funções para strings

        // toLowerCase(), toUpperCase(), trim()
        // substring(inicio, [fim])
        // Replace(char/string, char/string)
        // IndexOf(char), LastIndexOf(char)
        // str.split("[sep]")
        
        String my_name = "   Victoria Luquet";
        
        System.out.println(my_name.trim()); // Remove os espacos em branco do inicio/fim da string
        System.out.println(my_name.toUpperCase());
        System.out.println(my_name.indexOf('V'));
        
        int average_value = average(5, 7);
        System.out.println("Average is: " + average_value + " and " + average(5, 7));
    }
    
    // ! Funções (muito igual a C)
    // Chamamos ela na main
    public static int average(int x, int y) {
        return (x + y) / 2;
    }
}
