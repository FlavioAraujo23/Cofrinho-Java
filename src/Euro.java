public class Euro extends Moeda {
  // declarando os metodos
  public Euro(double valor) {
    this.valor = valor;
  }

  @Override
  public void info() {
    System.out.println("Euro - " + valor);
  }

   // convertendo para real no valor atualizado do euro
  @Override
  public double converter() {
    return this.valor * 5.36;
  }
  
  // redeclarando o metodo equals para fazer a remocao da moeda
  @Override
  public boolean equals(Object obj) {
    if (obj == null || this.getClass() != obj.getClass()) {
        return false;
    }
    // fazendo o cast da classe
    Euro ObjDeEuro = (Euro) obj;

    if(this.valor != ObjDeEuro.valor) {
        return false;
    }else {
      return true;
    }
      
    }  
}
