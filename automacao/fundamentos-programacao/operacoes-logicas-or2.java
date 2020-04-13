public class Exemplo {
    public static void main(String args[]) {
        // 9 e positivo OU o resto da divisao de 4 com 2 e igual a 0?
        System.out.println((9 > 0) || (4 % 2 == 0)); 	// true
        // 4 e maior ou igual a 4 OU 2 e diferente de 2?
        System.out.println((4 >= 4) || (2 != 2));	// true
        // 4 e menor que tres OU 2 elevado a tres e igual a 8?
        System.out.println(4 < 3) || ((Math.pow(2, 3)) == 8));	// true
        // 1 e maior que 9999 OU 987 menos 986 e negativo?
        System.out.println((1 > 9999) || ((987 - 986) < 0));	// false
    }
}