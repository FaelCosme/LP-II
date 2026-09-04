void main()  {

    Scanner in = new Scanner(System.in);


    CadastrarVeiculoFila veiculos = new CadastrarVeiculoFila();

    String placa;
    int opcao;

    do{
        System.out.println("=== Sistema de Gerenciamento de Estacionamento ===");
        System.out.println("Selecione uma opção do MENU abaixo:");

        System.out.println("1 - Cadastrar Veiculo");
        System.out.println("2 - Remover Veiculo");
        System.out.println("3 - Consultar Veiculo");
        System.out.println("0 - SAIR");
        System.out.print(": ");
        opcao = in.nextInt();


        switch (opcao){
            case 1:
                System.out.println("Digite a placa do veiculo: ");
                placa = in.next();

                veiculos.adicionarVeiculo(placa);

                break;

            case 2:
                System.out.println("Digite a placa do veiculo: ");
                placa = in.next();

                veiculos.removerVeiculo(placa);

                break;

            case 3:
                System.out.println("Digite a placa do veiculo: ");
                placa = in.next();

                veiculos.consultarVeiculo(placa);

                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }while(opcao != 0);

    veiculos.listarVeiculos();


}
