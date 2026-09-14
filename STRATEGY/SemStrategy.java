public class CalculadoraDesconto {

  public double calcular(String tipo, double preco) {

    // Vários algoritmos para o mesmo objeto
    // Classe cada vez maior
    if (tipo.equals("normal")) {
      return preco * 0.05;

    } else if (tipo.equals("vip")) {
      return preco * 0.20;

    } else if (tipo.equals("funcionario")) {
      return preco * 0.30;
    }

    return 0;
  }

  public static void main(String[] args) {

    CalculadoraDesconto calculadora = new CalculadoraDesconto();

    System.out.println(calculadora.calcular("normal", 100)); // 5.0
    System.out.println(calculadora.calcular("vip", 100)); // 20.0
    System.out.println(calculadora.calcular("funcionario", 100)); // 30.0
  }
}