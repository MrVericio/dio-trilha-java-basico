public class ResultadoEscola {
    public static void main(String[] args) {
        int nota = 6;
        // Recebe uma nota e verifica se é maior ou igual a 7 para determinar se o aluno
        // está aprovado ou reprovado

        if (nota >= 7) {
            System.out.println("Aprovado");
            // Imprime "Aprovado" se a nota for maior ou igual a 7
        } else {
            System.out.println("Reprovado");
            // Imprime "Reprovado" se a nota for menor que 7
        }
    }
}
