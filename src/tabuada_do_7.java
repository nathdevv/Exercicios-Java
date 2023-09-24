public class tabuada_do_7 {
    public static void main(String[] args) {

        int numero = 7;
        int limite = 10;

        System.out.println("Calculando a tabuada do 7:");

        for (int multiplicador = 1; multiplicador <= limite; multiplicador++) {

            int resultado = numero * multiplicador;

            System.out.println(numero + "x" + multiplicador + "=" + resultado);
        }

    }
}

// 7
