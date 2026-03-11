package sistemabancario;
import java.util.Scanner;

public class testaBanco {
    
    public static void main(String[] args) {

        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("\n------ SISTEMA BANCARIO ------");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver saldo na conta");
            System.out.println("0 - Sair");
            
            opcao = scanner.nextInt();
            
            if(opcao == 1){
                System.out.println("Numero da conta: ");
                int numero = scanner.nextInt();
                
                System.out.println("Nome do titular: ");
                scanner.nextLine(); //LIMPA O ENTER
                String titular = scanner.nextLine();
                
                banco.criarConta(numero, titular);
            }
            
            if (opcao == 2){
                System.out.println("Numero da conta: ");
                int numero = scanner.nextInt();
                
                Conta conta = banco.buscarConta(numero);
                
                if (conta != null){
                    System.out.println("Valor: ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);                                       
                }
            }
            
            if (opcao == 3){
                System.out.println("Numero da conta: ");
                int numero = scanner.nextInt();
                
                Conta conta = banco.buscarConta(numero);
                
                if (conta != null){
                    System.out.println("Valor: ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);                   
                }
            }
            
            if (opcao == 4){
                System.out.println("Numero da conta: ");
                int numero = scanner.nextInt();
                
                Conta conta = banco.buscarConta(numero);
                
                if(conta != null){
                    conta.mostrarSaldo();
                }
            }
        }while (opcao != 0);
        
    }   
}
