public class Conta {
  float saldo;
  String conta;

  public Conta(String conta) {
    saldo = 0;
    this.conta = conta;
  }

  public void depositar (float deposito) {
    saldo += deposito;
  }

  public void sacar(float sacar) {
    if(sacar > saldo) {
      System.out.println("Erro: saldo insuficiente");
    }
    else {
      saldo -= sacar;
        
    }
    
  }

  public String toString () {
    return "Conta: " + conta + "\nSaldo: " + saldo;
    
  }

}