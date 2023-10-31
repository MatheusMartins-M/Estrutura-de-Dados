    import java.util.Random;
    import java.util.Scanner;

    public class ClasseVetor {
        Random valorAleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int[] vetorInterno;
        int quantosOcupados;
        boolean ordenados;

        public ClasseVetor(int tamanhoVetor) {
            vetorInterno = new int[tamanhoVetor];
            quantosOcupados = 0;

        }

        public void zerarVetor() {
            for (int i = 0; i < vetorInterno.length; i++) {
                vetorInterno[i] = 0;
            }

            quantosOcupados = 0;

            System.out.println("O vetor foi zerado!!");
            System.out.println();
        }

        public void preencheSemDuplicados() {
            int duplicados = 0;

            if (quantosOcupados == vetorInterno.length) {
                System.out.println("O vetor já está totalmente preenchido!");
                System.out.println();

            } else {

                for (int i = 0; i < vetorInterno.length; i++) {
                    if(vetorInterno[i] == 0){
                        vetorInterno[i] = geraAleatorio();
                        quantosOcupados++;
                    }
                }

                for (int i = 0; i < vetorInterno.length; i++) {
                    for (int j = 0; j < i; j++) {
                        if (vetorInterno[j] == vetorInterno[i]) {
                            duplicados++;
                        }
                    }
                }

                System.out.println("Os valores foram adicionados!!");
                ordenados = false;

                if (duplicados != 0) {
                    System.out.println("Existem números duplicados!!!!!");
                }

                System.out.println();
            }
        }

        public void preencheCrescente() {
            vetorInterno[0] = geraAleatorio();

            if (quantosOcupados != 0) {
                System.out.println("O vetor já está preenchido!");
                System.out.println();

            } else {

                for (int i = 1; i < vetorInterno.length; i++) {
                    if(vetorInterno[i] == 0){
                        vetorInterno[i] = (geraAleatorio() + vetorInterno[i - 1]);
                        quantosOcupados++;
                    }
                }

                System.out.println("Os valores foram adicionados!!");
                ordenados = true;

                System.out.println();

            }
        }
        public void inserePosicao(){
            int posicao;
            System.out.println("Em qual posição você deseja inserir um valor?");
            System.out.print("Posição: ");
            posicao = teclado.nextInt();

            for(int i = 0; i < vetorInterno.length; i++){
                if(posicao == i){
                    System.out.println();
                    System.out.println("A posição foi encontrada!!");
                    System.out.println("Qual valor você deseja adicionar?");
                    System.out.print("Valor: ");
                    vetorInterno[posicao] = teclado.nextInt();

                    while(vetorInterno[posicao] < 1){
                        System.out.println();
                        System.out.println("Esse número não, parça. Tenta de novo");
                        System.out.print("Valor: ");
                        vetorInterno[posicao] = teclado.nextInt();
                    }
                }
            }

            System.out.println();
            System.out.println("Número adicionado!!!");
            System.out.println();
        }

        public void informaQuantosElementos(){
            quantosOcupados = 0;

            for(int i = 0; i < vetorInterno.length; i++){
                if(vetorInterno[i] != 0){
                    quantosOcupados++;
                }
            }

            System.out.println("Existem "+ quantosOcupados +" valores ocupados no vetor!!!");
            System.out.println();
        }
        public void informaMaiorMenor() {
            int maior, menor;

            maior = menor = vetorInterno[0];

            for (int i = 1; i < vetorInterno.length; i++) {
                if (vetorInterno[i] > maior) {
                    maior = vetorInterno[i];
                }
                if (vetorInterno[i] < menor) {
                    menor = vetorInterno[i];
                }
            }

            System.out.println("O maior valor contido no vetor é: " + maior);
            System.out.println("O menor valor contido no vetor é: " + menor);
            System.out.println();

        }
        public void apresentaVetor(){
            for(int i = 0; i < vetorInterno.length; i++){
                System.out.print("[ "+ vetorInterno[i] +" ]");
            }
            System.out.println();
            System.out.println();
        }

        public void apagaValor(){
            int valor;
            System.out.println("Em qual posição você deseja apagar um valor?");
            System.out.print("Posição: ");
            valor = teclado.nextInt();

            for(int i = 0; i < vetorInterno.length; i++){
                if(valor == vetorInterno[i]){
                    System.out.println("O valor foi encontrado!!");
                    vetorInterno[i] = 0;
                    System.out.println("O valor foi apagado!!");
                    quantosOcupados--;
                }
            }
            System.out.println();
        }
        public void apagaPosicao(){
            int posicao;
            System.out.println("Em qual posição você deseja apagar um valor?");
            System.out.print("Posição: ");
            posicao = teclado.nextInt();

            for(int i = 0; i < vetorInterno.length; i++){
                if(posicao == i){
                    System.out.println("A posição foi encontrada!!");
                    System.out.println();
                    vetorInterno[posicao] = 0;
                    System.out.println("O valor da posicao foi apagado!!");
                }
                quantosOcupados--;
            }
            System.out.println();
        }
        public void consultaSequencial(){
            int valorConsulta, anotar = 0, posicao = 0;

            if(quantosOcupados == 0){
                System.out.println("Não existem números cadastrados!!");
                System.out.println();

            }else {

                System.out.print("Insira o valor a ser consultado: ");
                valorConsulta = teclado.nextInt();

                for (int i = 0; i < vetorInterno.length; i++) {
                    if (valorConsulta == vetorInterno[i]) {
                        anotar = 1;
                        posicao = i;
                        i = vetorInterno.length;
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
        public void consultaBinaria(){
            int inicio, fim, valorConsulta, posicao;

            inicio = 0;
            fim = (vetorInterno.length - 1);
            posicao = -1;

            if(quantosOcupados == 0){
                System.out.println("Não existem números cadastrados!!");
                System.out.println();

            }else {

                System.out.print("Insira o valor a ser consultado: ");
                valorConsulta = teclado.nextInt();

                while (inicio <= fim) {
                    int meio = (inicio + fim) / 2;

                    if (vetorInterno[meio] == valorConsulta) {
                        posicao = meio;
                        inicio = (vetorInterno.length + 1);

                    } else if (vetorInterno[meio] < valorConsulta) {
                        inicio = meio + 1;

                    } else {
                        fim = meio - 1;
                    }
                }

                if (posicao != -1) {
                    System.out.println("O valor foi cadastrado na posição " + posicao);
                } else {
                    System.out.println("O valor não foi cadastrado");
                }

                System.out.println();
            }
        }
        public void ordenaBubble(){
            int ultimo, aux;

            if(quantosOcupados == 0){
                System.out.println("Não existem números cadastrados!!");
                System.out.println();

            }
            else if (ordenados == true) {
                System.out.println("O vetor já está ordenado!!");
                System.out.println();

            } else {

                for (ultimo = (vetorInterno.length - 1); ultimo > 0; ultimo--) {
                    for (int i = 0; i < ultimo; i++) {
                        if (vetorInterno[i] > vetorInterno[i + 1]) {
                            aux = vetorInterno[i];
                            vetorInterno[i] = vetorInterno[i + 1];
                            vetorInterno[i + 1] = aux;

                        }
                    }
                }
                System.out.println("O vetor foi ordenado!!");
                System.out.println();
            }
            ordenados = true;

        }
        public void ordenaInsertion() {
            int inicio, aux;

            if (quantosOcupados == 0) {
                System.out.println("Não existem números cadastrados!!");
                System.out.println();

            } else if (ordenados == true) {
                System.out.println("O vetor já está ordenado!!");
                System.out.println();

            } else {


                for (int i = 1; i < vetorInterno.length; i++) {
                    aux = vetorInterno[i];
                    inicio = i - 1;

                    while ((inicio >= 0) && (vetorInterno[inicio] > aux)) {
                        vetorInterno[inicio + 1] = vetorInterno[inicio];
                        inicio = inicio - 1;

                    }

                    vetorInterno[inicio + 1] = aux;

                }

                System.out.println("O vetor foi ordenado!!");
                System.out.println();

            }
            ordenados = true;

        }
        public void ordenaSelection() {
            int menor, aux;

            if (quantosOcupados == 0) {
                System.out.println("Não existem números cadastrados!!");
                System.out.println();

            } else if (ordenados == true) {
                System.out.println("O vetor já está ordenado!!");
                System.out.println();

            } else {


                for (int i = 0; i < vetorInterno.length; i++) {
                    menor = i;

                    for (int j = 0; j < vetorInterno.length; j++) {
                        if (vetorInterno[j] > vetorInterno[menor]) {
                            aux = vetorInterno[j];
                            vetorInterno[j] = vetorInterno[menor];
                            vetorInterno[menor] = aux;

                        }
                    }
                }

                System.out.println("O vetor foi ordenado!!");
                System.out.println();
            }
            ordenados = true;

        }
        public void ordenaQuick() {
            if (quantosOcupados == 0) {
                System.out.println("Não existem números cadastrados!!");
                System.out.println();

            } else if (ordenados == true) {
                System.out.println("O vetor já está ordenado!!");
                System.out.println();

            } else {

                quickSort(0, quantosOcupados - 1);

                System.out.println("O vetor foi ordenado!!");
                System.out.println();
            }

            ordenados = true;
        }

        public void quickSort(int inicio, int fim) {
            int posicaoPivo;

            if (inicio < fim) {
                posicaoPivo = partition(inicio, fim);

                quickSort(inicio, posicaoPivo - 1);
                quickSort(posicaoPivo + 1, fim);
            }
        }

        public int partition(int inicio, int fim) {
            int pivo = vetorInterno[fim];
            int i = inicio - 1;
            int aux;

            for (int j = inicio; j <= fim - 1; j++) {
                if (vetorInterno[j] < pivo) {
                    i++;

                    aux = vetorInterno[i];
                    vetorInterno[i] = vetorInterno[j];
                    vetorInterno[j] = aux;

                }
            }

            aux = vetorInterno[i + 1];
            vetorInterno[i + 1] = vetorInterno[fim];
            vetorInterno[fim] = aux;

            return i + 1;
        }
        public int geraAleatorio(){
            int numeroAleatorio;
            numeroAleatorio = this.valorAleatorio.nextInt(10000);

            if(numeroAleatorio == 0){
                geraAleatorio();
            }
            return numeroAleatorio;
        }
    }

