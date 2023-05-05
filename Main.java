public class Main {
  public static void main(String[] args) {
    Conta a = new Conta("Conta1");
    Conta b = new Conta("Conta2");
    System.out.println(a.toString());
    a.depositar(200);
    System.out.println(a.toString());
    a.sacar(150);
    System.out.println(a.toString());
    
  }
}