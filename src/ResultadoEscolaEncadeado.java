public class ResultadoEscolaEncadeado {
    public static void main(String[] args) {
        int nota = 6;
        // Recebe uma nota e verifica se é maior ou igual a 7 para determinar se o aluno
        // está aprovado ou reprovado

        if (nota >= 7) {
            System.out.println("Aprovado");
            // Imprime "Aprovado" se a nota for maior ou igual a 7
        } else if (nota >= 5) {
            System.out.println("Recuperação");
            // Imprime "Recuperação" se a nota for maior ou igual a 5 e menor que 7
        } else {
            System.out.println("Reprovado");
            // Imprime "Reprovado" se a nota for menor que 5
        }
    }
}
