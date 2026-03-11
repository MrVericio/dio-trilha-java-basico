public class ResultadoEscolaTernaria {
    public static void main(String[] args) {
        int nota = 7;
        // Recebe uma nota e verifica se é maior ou igual a 7 para determinar se o aluno
        // está aprovado ou reprovado

        String resultado = (nota >= 7) ? "Aprovado" : (nota >= 5) ? "Recuperação" : "Reprovado";
        // Utiliza o operador ternário para determinar o resultado com base na nota

        System.out.println(resultado);
        // Imprime o resultado determinado pelo operador ternário
    }
}
