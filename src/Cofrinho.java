import java.util.ArrayList;

public class Cofrinho {

  private ArrayList <Moeda> listaMoedas;

  // criando uma lista vazia para o cofrinho por meio do construtor de Cofrinho
  public Cofrinho() {
  this.listaMoedas = new ArrayList<>();
  }

  // declarando o metodo de adicionar moeda
  public void adicionar(Moeda moeda) {
    this.listaMoedas.add(moeda);
  }

  // declarando o metodo de remover moeda 
  public boolean remover(Moeda moeda) {
    return this.listaMoedas.remove(moeda);
  }

  // declarando o metodo de listagem de moedas
  public void listagemMoedas() {
    if(this.listaMoedas.size() == 0){
      System.out.println("A lista esta vazia, adicione alguma moeda");
    }
    for(Moeda moeda : this.listaMoedas){
      moeda.info();
    }
  }

  // declarando o metodo de converter o total convertido para real
  double total = 0;
  public double totalConvertido() {
     if(this.listaMoedas.size() == 0){
      System.out.println("A lista esta vazia, portanto o total convertido é 0");
    }
     for(Moeda moeda : this.listaMoedas){
       total = total + moeda.converter();
    }
    return total;
  }
}

