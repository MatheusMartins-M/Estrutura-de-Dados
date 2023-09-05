import java.util.Scanner;
public class Main {
    static Scanner teclado = new Scanner(System.in);
    static int quantosValores = 0, quantidadeVetor = 5;
    static int [] vetor = new int[quantidadeVetor];
    public static void main(String[] args) {

        int escolha = -1;

        while (escolha != 0) {
            mostraMenu();
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1 -> zeraVetor();
                case 2 -> insereValor();
                case 3 -> apagaValor();
                case 4 -> consultaValor();
                case 5 -> informaQuantidade();
                case 6 -> falaMaior();
                case 7 -> falaMenor();
                case 8 -> apresentaLista();
                case 0 -> encerraPrograma();
                default -> System.out.println("\nOpção inválida. Tente novamente\n");

            }
        }
    }
    static void mostraMenu() {
        System.out.println("------------------------------------------------Menu------------------------------------------------");
        System.out.println("1) Criar o vetor vazio ou zerar o vetor");
        System.out.println("2) Inserir um valor no vetor");
        System.out.println("3) Apagar um valor do vetor");
        System.out.println("4) Consultar se existe determinado valor no vetor");
        System.out.println("5) Consultar quantos valores significativos já ocupam o vetor");
        System.out.println("6) Consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor");
        System.out.println("7) Consultar qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor");
        System.out.println("8) Apresentar uma listagem dos valores armazenados no vetor");
        System.out.println("0) Sair do programa");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.print("Escolha: ");
    }
    static void zeraVetor() {
        System.out.println();
        for (int i = 0; i < quantidadeVetor; i++) {
            vetor[i] = 0;
        }

        quantosValores = 0;

        System.out.println(">>>>>>> Vetor zerado com sucesso! <<<<<<");
        System.out.println();

    }
    static void insereValor() {
        int i = 0;

        if(quantosValores >= quantidadeVetor){
            System.out.println(">>>>>> Vetor completo <<<<<<");
            System.out.println();

        }else {

            while(i < quantidadeVetor){
                if(vetor[i] != 0){
                    i++;
                }else{
                    System.out.println();
                    System.out.print("Digite o valor a ser inserido no vetor: ");
                    vetor[i] = teclado.nextInt();
                    i = quantidadeVetor;
                }
            }

            quantosValores++;

            System.out.println();
        }
    }
    static void apagaValor() {
        int valorZerado;

        if(quantosValores == 0){
            System.out.println(">>>>>> Não existem valores cadastrados <<<<<<");

        }else {

            System.out.println();
            System.out.print("Selecione a posicao a ser zerada: ");
            valorZerado = teclado.nextInt();

            while (valorZerado > quantidadeVetor || valorZerado < 0) {
                System.out.println("Não existe essa opção, meu chapa");
                System.out.print("Tenta de novo: ");
                valorZerado = teclado.nextInt();
            }

            vetor[valorZerado] = 0;

            quantosValores--;

        }
    }
    static void consultaValor() {
        int valorConsulta, anotar = 0, posicao = 0;

        if(quantosValores == 0){
            System.out.println("Não existem valores cadastrados");

        }else {

            System.out.println();
            System.out.print("Insira o valor a ser consultado: ");
            valorConsulta = teclado.nextInt();

            for (int i = 0; i < quantidadeVetor; i++) {
                if (valorConsulta == vetor[i]) {
                    anotar = 1;
                    posicao = i;
                }
            }

            if (anotar == 1) {
                System.out.println("O valor foi cadastrado na posição: " + posicao);

            } else {

                System.out.println("O valor não foi cadastrado");
            }

            System.out.println();
        }
    }
    static void informaQuantidade() {
        quantosValores = 0;
        for (int i = 0; i < quantidadeVetor; i++){
            if(vetor[i] != 0){
                quantosValores++;
            }
        }

        System.out.println();
        System.out.println("Foram cadastrados " + quantosValores + " valores");
        System.out.println();

    }
    static void falaMaior() {
        int maiorValor, valorPosicao = -1;
        maiorValor = Integer.MIN_VALUE;
        System.out.println();

        if(quantosValores == 0){
            System.out.println("Não existem valores cadastrados");

        }else {
            for(int i = 0; i < quantidadeVetor; i++) {
                if (vetor[i] > maiorValor) {
                    maiorValor = vetor[i];
                    valorPosicao = i;
                }
            }

            System.out.println("Maior valor: " + maiorValor + " Posição: " + valorPosicao);
            System.out.println();
        }
    }
    static void falaMenor() {
        int menorValor, valorPosicao = -1;
        menorValor = Integer.MAX_VALUE;
        System.out.println();

        if(quantosValores == 0){
            System.out.println("Não existem valores cadastrados");

        }else {
            for(int i = 0; i < quantidadeVetor; i++) {
                if(vetor[i] < menorValor && vetor[i] != 0) {
                    menorValor = vetor[i];
                    valorPosicao = i;
                }
            }

            System.out.println("Menor valor: " + menorValor + " Posição " + valorPosicao);
            System.out.println();
        }
    }
    static void apresentaLista() {
        System.out.println();
        for (int i = 0; i < quantidadeVetor; i++) {
            System.out.print("[ "+ vetor[i]+" ] ");
        }

        System.out.println();
    }
    static void encerraPrograma() {
        System.out.println();
        System.out.println("Sistema encerrado");
    }
}