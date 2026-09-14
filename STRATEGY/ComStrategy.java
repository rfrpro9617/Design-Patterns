// Strategy
interface DescontoStrategy {

  double calcular(double preco);
}

// Concrete Strategies
class DescontoNormal implements DescontoStrategy {

  @Override
  public double calcular(double preco) {
    return preco * 0.05;
  }
}

class DescontoVip implements DescontoStrategy {

  @Override
  public double calcular(double preco) {
    return preco * 0.20;
  }
}

class DescontoFuncionario implements DescontoStrategy {

  @Override
  public double calcular(double preco) {
    return preco * 0.30;
  }
}

// Context (utiliz strategy)
class CalculadoraDesconto {

  private DescontoStrategy strategy;

  public CalculadoraDesconto(DescontoStrategy strategy) {
    this.strategy = strategy;
  }

  public double calcular(double preco) {
    return strategy.calcular(preco);
  }
}

public class Main {

  public static void main(String[] args) {

    CalculadoraDesconto normal = new CalculadoraDesconto(new DescontoNormal());

    CalculadoraDesconto vip = new CalculadoraDesconto(new DescontoVip());

    CalculadoraDesconto funcionario = new CalculadoraDesconto(new DescontoFuncionario());

    System.out.println(normal.calcular(100)); // 5.0
    System.out.println(vip.calcular(100)); // 20.0
    System.out.println(funcionario.calcular(100)); // 30.0
  }
}