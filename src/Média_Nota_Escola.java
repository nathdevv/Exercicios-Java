public class Média_Nota_Escola {

    public static void main(String[] args){

        // Podemos colocar as notas e medias em uma só variável porque todas foram instituídas como double.
        double nota1, nota2, media;
        // "final double" é utilizado para definir quando uma variável é constante.
        final double PESO_NOTA = 0.5;
        nota1 = 8;
        nota2 = 6.5;
        media = (nota1 * PESO_NOTA) + (nota2 * PESO_NOTA);


        System.out.println("A Média é: " + media);


    }
}
