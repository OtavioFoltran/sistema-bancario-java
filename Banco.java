package sistemabancario;
import java.util.ArrayList;
public class Banco {
    
    ArrayList<Conta> contas = new ArrayList<>();
    
    public void criarConta(int numero, String titular){
        Conta conta = new Conta(numero, titular,0);
        contas.add(conta);
        System.out.println("Conta criada com sucesso!");       
    }
    
    public Conta buscarConta(int numero){
        for(Conta conta : contas){
            if(conta.numero == numero){
                return conta;
            }
        }
        return null;
    }
    
}
