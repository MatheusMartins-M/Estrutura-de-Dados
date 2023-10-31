import java.util.Scanner;
public class Main {
    static int escolha = -1;
    public static void main(String[] args) {
        ClasseVetor vetor = new ClasseVetor(5);
        Scanner teclado = new Scanner(System.in);

        while(escolha != 0){
            mostraMenu();
            escolha = teclado.nextInt();
            System.out.println();

            switch (escolha){
                case 0 -> encerraTudo();
                case 1 -> vetor.preencheSemDuplicados();
                case 2 -> vetor.preencheCrescente();
                case 3 -> vetor.inserePosicao();
                case 4 -> vetor.apresentaVetor();
                case 5 -> vetor.informaQuantosElementos();
                case 6 -> vetor.informaMaiorMenor();
                case 7 -> vetor.apagaPosicao();
                case 8 -> vetor.apagaValor();
                case 9 -> vetor.consultaSequencial();
                case 10 -> vetor.consultaBinaria();
                case 11 -> vetor.ordenaBubble();
                case 12 -> vetor.ordenaInsertion();
                case 13 -> vetor.ordenaSelection();
                case 14 -> vetor.ordenaQuick();
                case 15 -> vetor.zerarVetor();
                default -> System.out.println("Opção inválida. Tente novamente\n");
            }
        }
    }
    static void mostraMenu(){
        System.out.println(">>>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<<<<<");
        System.out.println("1) Inserir valores aleatório não duplicados");
        System.out.println("2) Inserir valores aleatórios em ordem crescente");
        System.out.println("3) Inserir um valor em determinada posição");
        System.out.println("4) Apresentar o vetor");
        System.out.println("5) Informar quantos elementos válidos estão no vetor");
        System.out.println("6) Informar o maior e menor valor contido no vetor");
        System.out.println("7) Apagar uma determinada posição do vetor");
        System.out.println("8) Apagar um determinado valor do vetor");
        System.out.println("9) Consulta sequencial");
        System.out.println("10) Consulta binária");
        System.out.println("11) Ordenação Bubblesort");
        System.out.println("12) Ordenação Insertionsort");
        System.out.println("13) Ordenação Selectionsort");
        System.out.println("14) Ordenação Quicksort");
        System.out.println("15) Zerar vetor");
        System.out.println("0) Encerrar programa");
        System.out.print("Escolha: ");
    }

    static void encerraTudo(){
        System.out.println("Programa encerrado!!!!");
        escolha = 0;
    }
}