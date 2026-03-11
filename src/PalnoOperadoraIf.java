public class PalnoOperadoraIf {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String plano = "M";
        // Recebe um plano de operadora e imprime o valor correspondente ao plano

        if (plano == "B") {
            System.out.println("100 minutos de ligação)");
            // Imprime "100 minutos de ligação" se o plano for "B"
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram ilimitados");
            // Imprime "100 minutos de ligação" e "Whats e Instagram ilimitados" se o plano
            // for "M"
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram ilimitados");
            System.out.println("Netflix incluso");
            // Imprime "100 minutos de ligação", "Whats e Instagram ilimitados" e "Netflix
            // incluso" se o plano for "T"
        } else {
            System.out.println("Plano inválido");
            // Imprime "Plano inválido" se o plano não corresponder a nenhuma das opções
            // anteriores
        }
    }
}
