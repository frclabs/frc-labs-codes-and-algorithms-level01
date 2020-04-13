public class Exemplo {
    public static void main(String args[]) {
        // Vamos ver se um numero é par...
        int num = 10;
        if ((num % 2) == 0) {      
            // Se o resto da divisão por 2 for zero
            System.out.println("Esse número é par");
        }
        
        if (! (1 >= 99)) {
            System.out.println("1 < 99");
        }
        
        // Testando com o operador and
        if (true && true) {
            System.out.println("true && true");
        }
        
        if (true && false) {
            System.out.println("true && false");
        }
        
        if (false && true) {
            System.out.println("false && true");
        }
        
        if (false && false) {
            System.out.println("false && false");
        }
        
        // Testando com o operador or
        if (true || true) {
            System.out.println("true || true");
        }
        
        if (true || false) {
            System.out.println("true || false");
        }
        
        if (false || true) {
            System.out.println("false || true");
        }
        
        if (false || false) {
            System.out.println("false || false");
        }
        
        // Testando com operadores lógicos
        if (true && ! (false || ! true)) {
            System.out.println("true && true");
        }
        
        // Vamos ver se um numero é par e positivo
        num = 10;
        if (num % 2 == 0) {
            if (num > 0) {
                System.out.println("O número é par e positivo");
            }
        }
    }
}
