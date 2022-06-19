import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Lista lista = new Lista();
        lista.adicionarNoInicio (4);
        lista.adicionarNoInicio (3);
        lista.adicionarNoInicio (2);
        lista.adicionarNoInicio (1);
        lista.adicionarNoInicio (0);
        
        System.out.println(lista);

        while (true) {
        int iniciarLista;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserir elemento: 1");
        System.out.println("Remover elemento: 2");
        System.out.println("Limpar lista    : 3");

        iniciarLista = input.nextInt();

        if (iniciarLista == 1) {
            int escolherInserir;
            Scanner InserirInput = new Scanner(System.in);
            System.out.println("Inserir no inicio: 1");
            System.out.println("Inserir no final : 2");
            System.out.println("Esolher posição  : 3");
            escolherInserir = InserirInput.nextInt();
            if (escolherInserir == 1) {
                int elementoParaInserir;
                Scanner inserirElementoEscolherInput = new Scanner(System.in);
                System.out.println("Digite o número que você deseja inserir: ");
                elementoParaInserir = inserirElementoEscolherInput.nextInt();
                lista.adicionarNoInicio (elementoParaInserir);
                System.out.println( lista.tamanho () + "  " + lista );
            }
            if (escolherInserir == 2) {
                int elementoParaInserir;
                Scanner inserirElementoEscolherInput = new Scanner(System.in);
                System.out.println("Digite o número que você deseja inserir: ");
                elementoParaInserir = inserirElementoEscolherInput.nextInt();
                lista.inserirElemento (elementoParaInserir);
                System.out.println( lista.tamanho () + "  " + lista );
            }
            if (escolherInserir == 3) {
                int elementoParaInserir;
                Scanner inserirElementoEscolherInput = new Scanner(System.in);
                System.out.println("Digite o número que você deseja inserir: ");
                elementoParaInserir = inserirElementoEscolherInput.nextInt();
                int escolherPosicao;
                Scanner EscolherPosicaoInput = new Scanner(System.in);
                System.out.println("Digite a posicao que deseja inserir: ");
                escolherPosicao = EscolherPosicaoInput.nextInt();
                lista.inserirElemento (escolherPosicao,elementoParaInserir);
                System.out.println( lista.tamanho () + ": " + lista);

            }

        }

        if (iniciarLista == 2) {
            int escolherInserir;
            Scanner InserirInput = new Scanner(System.in);
            System.out.println("remover no inicio: 1");
            System.out.println("remover no final : 2");
            System.out.println("Esolher posição  : 3");
            escolherInserir = InserirInput.nextInt();
            if (escolherInserir == 1) {
                lista.removerDoInicio();
                System.out.println( lista.tamanho () + "  " + lista );
            }
            if (escolherInserir == 2) {
                lista.removerFinal();
                System.out.println( lista.tamanho () + "  " + lista );
            }
            if (escolherInserir == 3) {
                int escolherRemover;
                Scanner RemoverInput = new Scanner(System.in);
                System.out.println("Qual posição deseja remover? ");
                escolherRemover = RemoverInput.nextInt();
                lista.remove(escolherRemover);
                System.out.println( lista.tamanho () + "  " + lista );

            }

        }

        if (iniciarLista == 3) {
            lista.exitLista();
            System.out.println(lista.tamanho() +" : " + lista);
        }

        }

    }

}
