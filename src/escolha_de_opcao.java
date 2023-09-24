public class escolha_de_opcao {
    public static void main(String[] args){

        int opcao = 2;

        String opcaoEscolhida;

        switch (opcao) {
            case 1:
                opcaoEscolhida = "Você escolheu a opcão 1";
                break;
            case 2:
                opcaoEscolhida = "Você escolheu a opcão 2";
                break;
            case 3:
                opcaoEscolhida = "Você escolheu a opção 3";
                break;
            default:
                opcaoEscolhida = "Opcão inválida!";
        }
        System.out.println(opcaoEscolhida);
    }
}
