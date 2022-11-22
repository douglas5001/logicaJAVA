package aula1;



import java.util.Scanner;

/**
 *
 * @author 182200305
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int opM;
        do {
            menuP();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.println("Calculadora de IMC");
                    calcIMC();
                    break;
                case 3:
                    System.out.println("Dias de Vida");
                    diasVida();
                    break;
                case 4:
                    System.out.println("Conversor de Moeda");
                    convMoeda();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo Usuário");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }

        } while (opM != 0);
    }//fim main 

    public static void menuP() {
        System.out.println("\nMenu Principal");
        System.out.println("1 - Hello World");
        System.out.println("2 - Calculadora IMC");
        System.out.println("3 - Calculadora de Dias de Vida");
        System.out.println("4 - Conversor de Moeda");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção do menu: ");

    }

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        return leia.nextFloat();
    }//fim leia float

    public static int leiaInt() {
        Scanner leia = new Scanner(System.in);
        return leia.nextInt();
    }

    private static void calcIMC() {
        float alt, peso, imc;
        System.out.print("Informe a altura: ");
        alt = leiaFloat();
        System.out.print("Informe o peso: ");
        peso = leiaFloat();
        imc = calculaIMC(alt, peso);
        System.out.printf("\nSeu IMC ficou em: %.2f", imc);
        System.out.println("");
    }//fim calc IMC

    private static void diasVida() {
        int idade, diasVida;
        System.out.println("Informe sua idade: ");
        idade = leiaInt();
        diasVida = idade * 365;
        System.out.println("Você já viveu " + diasVida + " dias de vida aproximademente.");
    }

    private static void convMoeda() {
        System.out.println("Moedas");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Yen");
        System.out.println("Digite uma das opções a cima!");
        int opM = leiaInt();
        float real, conversao;

        switch (opM) {
            case 1:
                System.out.print("Cotação do Dólar: US$ ");
                float dolar = leiaFloat();
                System.out.print("Valor em real: R$ ");
                real = leiaFloat();
                conversao = real / dolar;
                System.out.printf("R$ " + real + "em US$ %.2f", conversao);
                break;
            case 2:
                System.out.print("Cotação Euro: EU$ ");
                float euro = leiaFloat();
                System.out.print("Valor em real: R$ ");
                real = leiaFloat();
                conversao = real / euro;
                System.out.printf("R$ " + real + "em EUS$ %.2f", conversao);
                break;
            case 3:
                System.out.print("Cotação Yen: JP$ ");
                float yen = leiaFloat();
                System.out.print("Valor em real: R$ ");
                real = leiaFloat();
                conversao = real / yen;
                System.out.printf("R$ " + real + "em JPS$ %.2f", conversao);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        
        }
    }
    
    public static float calculaIMC(float alt, float peso){
        return peso / (alt * alt);
    }
}