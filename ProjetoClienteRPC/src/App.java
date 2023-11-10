
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);

        // Criando o menu e as váriaveis que serão usadas pela calculadora
        // 'scanner' para receber entradas 
        Scanner sc = new Scanner (System.in);

        //variáveis inicializadas como zero
        int numero1,numero2 = 0;

        // O programa entra em um loop infinito com while (true) para apresentar um menu de opções e interagir com o usuário.
        while (true) {

            System.out.println("Selecione a operação desejada: ");
            System.out.println("1. Calcular área de um quadrado.\n");
            System.out.println("2. Calcular área de um triângulo retângulo.\n");
            System.out.println("3. Calcular área de uma circunferência.\n ");
            System.out.println("4. Calcular área de uma esfera.\n ");
            System.out.println("5. Calcular volume de uma esfera.\n ");
            System.out.println("6. Calcular área de um cilindro.\n ");
            System.out.println("7. Calcular volume de um cilindro.\n ");
            System.out.println("8. Calcular área de superfície de um cubo.\n ");
            System.out.println("9. Calcular volume de um cubo.\n ");
            System.out.println("0. Sair.\n ");
            System.out.print("Digite a opção desejada: ");

            int opcao = sc.nextInt();
            // O programa  solicita os valores necessarios para realizar o cálculo e em seguida faz uma chamada ao servidor remoto usando os métodos da classe 'ClienteRPC'
    
            switch (opcao) {

                case 1:
                System.out.println("Digite o valor do lado: ");
                numero1 = sc.nextInt();
                System.out.println("\nA área do quadrdo é: " + rpc.areaQuadrado(numero1));
            break;

            case 2:
                System.out.println("Digite o valor da base: ");
                numero1 = sc.nextInt();
                System.out.println("Digite o valor da altura: ");
                numero2 = sc.nextInt();
                System.out.println("\nA área do Triangulo retângulo é: " + rpc.areaTrianguloRetangulo(numero1,numero2));
                break;

            case 3:
                System.out.println("Digite o valor do raio");
                numero1 = sc.nextInt();
                System.out.println("\nA área da circunferencia é: " + rpc.areaCircunferencia(numero1));
                break;

            case 4:
               System.out.println("Digite o valor do raio: ");
               numero1 = sc.nextInt();
               System.out.println("\nA área da esfera é: " + rpc.areaEsfera(numero1));
               break;

            case 5: 
               System.out.println("Digite o valor do raio: ");
               numero1 = sc.nextInt();
               System.out.println("\nO volume da esfera é: : " + rpc.volumeEsfera(numero1));
               break;

            case 6: 
               System.out.println("Digite o valor do raio: ");
               numero1 = sc.nextInt();
               System.out.println("Digite o valor da altura: ");
               numero2 = sc.nextInt();
               System.out.println("\n A area do cilindro é: : " + rpc.areaCilindro(numero1, numero2));
               break;

            case 7:
               System.out.println("Digite o valor do raio: ");
               numero1 = sc.nextInt();
               System.out.println("Digite o valor da altura: ");
               numero2 = sc.nextInt();
               System.out.println("\nO volume do cilindro é: : " + rpc.volumeCilindro(numero1, numero2));
               break;
               
            case 8:
               System.out.println("Digite o valor do lado:  ");
               numero1 = sc.nextInt();
               System.out.println("Digite o valor do lado: ");
               numero2 = sc.nextInt();
               System.out.println("\nA área do cubo é: " + rpc.areaCubo(numero1, numero2));
               break;

            case 9:
               System.out.println("Digite o valor do lado:  ");
               numero1 = sc.nextInt();
               System.out.println("Digite o valor do lado: ");
               numero2 = sc.nextInt();
               System.out.println("Digite o valor do lado: ");
               System.out.println("\nO volume do cubo é: " + rpc.volumeCubo(numero1, numero2));
               break;

            case 0:
               System.out.println("Saindo...");
               break;

           default:
               System.out.println("\nOpção inválida. Tente novamente.");
               break;

               
            }
        
        }
    }
}