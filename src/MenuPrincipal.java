import java.util.Scanner;

public class MenuPrincipal {

  // adicionando o scanner para ler um dado do usuario
  private Scanner teclado;

  // declarando o objeto cofrinho
  private Cofrinho cofrinho;

  public MenuPrincipal() {
    // instanciando o scanner na variavel teclado
    teclado = new Scanner(System.in);

    // instanciando um novo cofrinho
    cofrinho = new Cofrinho();
  }
  // declarando o metodo que mostra na tela as opcoes em forma de menu
  public void mostrarMenuPrincipal() {
    System.out.println("COFRINHO:");
    System.out.println("1-Adicionar moeda");
    System.out.println("2-Remover moeda");
    System.out.println("3-Listar moedas");
    System.out.println("4-Calcular valor total convertido para real");
    System.out.println("0-Encerrar");

    String opcaoSelecionada = teclado.next();

    // usando o switch case para tratar a opção selecionada
    switch (opcaoSelecionada) {
        case "0":
            System.out.println("Encerrando...");
            break;

        case "1":
            System.out.println("Escolha Moeda:");
            System.out.println("1-Real:");
            System.out.println("2-Dolar:");
            System.out.println("3-Euro:");
            int opcaoMoedaDigitada = teclado.nextInt();

            // verificando se a opçao para selecionar moeda foi digitado corretamente
            if (opcaoMoedaDigitada == 1 || opcaoMoedaDigitada == 2 || opcaoMoedaDigitada == 3) {
              System.out.println("Digite o valor:");
              String valorDigitadoMoeda = teclado.next();

              // caso o valor digitado esteja com virgula, aqui irar reatribui-lo em um valor com ponto
              valorDigitadoMoeda = valorDigitadoMoeda.replace(",", ".");
            
              // agora transformo essa string em um double, e armazeno na variavel
              double valorMoedaDouble = Double.parseDouble(valorDigitadoMoeda);
            
              // bloco de comando para intanciar a moeda e adicionar ao cofrinho conforme a opção digitada
              if(opcaoMoedaDigitada == 1) {
                Real moeda = new Real(valorMoedaDouble);
                cofrinho.adicionar(moeda);
              } 
              else if (opcaoMoedaDigitada == 2) {
                Dolar moeda = new Dolar(valorMoedaDouble);
                cofrinho.adicionar(moeda);
              }  
              else if (opcaoMoedaDigitada == 3) {
               Euro moeda = new Euro(valorMoedaDouble);
               cofrinho.adicionar(moeda);
             }
            }else {
              System.out.println("Essa moeda não existe, voltando ao menu principal...");
              mostrarMenuPrincipal();
              }
            mostrarMenuPrincipal();
            break;
        
        case "2":
            System.out.println("Escolha Moeda:");
            System.out.println("1-Real:");
            System.out.println("2-Dolar:");
            System.out.println("3-Euro:");
            int opcaoMoedaSelecionada = teclado.nextInt();

            // verificando se a opçao para selecionar moeda foi digitado corretamente
            if (opcaoMoedaSelecionada == 1 || opcaoMoedaSelecionada == 2 || opcaoMoedaSelecionada == 3) {
              System.out.println("Digite o valor:");
              String valorDigitadoMoeda = teclado.next();

              // caso o valor digitado esteja com virgula, aqui irar reatribui-lo em um valor com ponto
              valorDigitadoMoeda = valorDigitadoMoeda.replace(",", ".");
            
              // agora transformo essa string em um double, e armazeno na variavel
              double valorMoedaDouble = Double.parseDouble(valorDigitadoMoeda);
            
              // bloco de comando para intanciar a moeda e remover ela do cofrinho conforme a opção digitada
              if(opcaoMoedaSelecionada == 1) {
                Real moeda = new Real(valorMoedaDouble);
                cofrinho.remover(moeda);
              } 
              else if (opcaoMoedaSelecionada == 2) {
                Dolar moeda = new Dolar(valorMoedaDouble);
                cofrinho.remover(moeda);
              }  
              else if (opcaoMoedaSelecionada == 3) {
               Euro moeda = new Euro(valorMoedaDouble);
               cofrinho.remover(moeda);
             }
            }else {
              System.out.println("Essa moeda não existe, voltando ao menu principal...");
              mostrarMenuPrincipal();
              }
            mostrarMenuPrincipal();
            break;
        
        case "3":
            cofrinho.listagemMoedas();
            mostrarMenuPrincipal();
            break;

        case "4":
            System.out.println("O total convertido para real ? " + cofrinho.totalConvertido());
            mostrarMenuPrincipal();
            break;
        default:
            System.out.println("Opção invalida, digite novamente.");
            mostrarMenuPrincipal();
            break;
    }
    
  }
}
