public class Dolar extends Moeda {
  // declarando os metodos

  public Dolar(double valor) {
    this.valor = valor;
  }

  @Override
  public void info() {
    System.out.println("Dolar - " + valor);
  }
  // convertendo para real no valor atualizado do dolar
  @Override
  public double converter() {
    return this.valor * 4.92;
  }

  // redeclarando o metodo equals para fazer a remocao da moeda
  @Override
  public boolean equals(Object obj) {
    if (obj == null || this.getClass() != obj.getClass()) {
        return false;
    }
    // fazendo o cast da classe
    Dolar ObjDeDolar = (Dolar) obj;

    if(this.valor != ObjDeDolar.valor) {
        return false;
    }else {
      return true;
    }
      
    }  
}
