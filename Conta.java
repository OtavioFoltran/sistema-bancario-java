package sistemabancario;

public class Conta {
    
    int numero;
    String titular;
    double saldo;
    
    public Conta(int numero, String titular, double saldo){
        
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;       
    }
    
    public void depositar (double valor){ 
        saldo += valor;     
    }
    
    public void sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
        }else{
            System.out.println("Saldo Insufisiente, seu saldo é de: "+ saldo);
        }
    }
    
    public void mostrarSaldo(){
        System.out.println("Seu saldo atual é de: "+"R$"+saldo);
    }
    
}
