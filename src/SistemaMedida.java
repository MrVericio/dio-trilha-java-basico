public class SistemaMedida {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String sigla = "M";
        // Recebe uma sigla de unidade de medida e imprime o nome completo da unidade

        if (sigla == "P") {
            System.out.println("PEQUENO");
            // Imprime "PEQUENO" se a sigla for "P"
        } else if (sigla == "M") {
            System.out.println("MEDIO");
            // Imprime "MEDIO" se a sigla for "M"
        } else if (sigla == "G") {
            System.out.println("GRANDE");
            // Imprime "GRANDE" se a sigla for "G"
        } else {
            System.out.println("INDEFINIDO");
            // Imprime "INDEFINIDO" se a sigla não corresponder a nenhuma das opções
            // anteriores
        }
    }
}
