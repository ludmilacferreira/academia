import java.util.Scanner;
public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
System.out.println("Menu de pagamento");
System.out.println("1. Dinheiro");
System.out.println("2. Cartão de Crédito");
System.out.println("3. Cartão de Débito");
System.out.println("4. PIX");
System.out.println("Escolha uma dessas opções:");

int opcao = scanner.nextInt();

switch (opcao) {
    case 1:
        System.out.println("Você escolheu pagar com Dinheiro.");
        break;
    case 2:
        System.out.println("Você escolheu pagar com Cartão de Crédito");
        break;
    case 3:
        System.out.println("Você escolheu pagar com Cartão de Débito");
        break;
    case 4:
        System.out.println("Você escolheu pagar com PIX");
        break;
    default:
        System.out.println("Opção inválida.");

}
    scanner.close();
}
}
