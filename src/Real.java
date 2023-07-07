public class Real extends Moeda {
  // declarando os metodos

  public Real(double valor) {
    this.valor = valor;
  }

  @Override
  public void info() {
    System.out.println("Real - " + valor);
  }

  @Override
  public double converter() {
    return this.valor;
  }
// redeclarando o metodo equals para fazer a remocao da moeda
  @Override
  public boolean equals(Object obj) {
    if (obj == null || this.getClass() != obj.getClass()) {
        return false;
    }
    // fazendo o cast da classe
    Real ObjDeReal = (Real) obj;

    if(this.valor != ObjDeReal.valor) {
       return false;
    }else {
       return true;
    }
      
    }  
}
