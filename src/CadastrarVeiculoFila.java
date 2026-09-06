import java.util.ArrayList;

public class CadastrarVeiculoFila{

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public CadastrarVeiculoFila(){
        veiculos = new ArrayList<>();
    }


    public void adicionarVeiculo(String placa){
        Veiculo novo = new Veiculo(placa);
        veiculos.add(novo);
        System.out.println("Veiculo adicionado com sucesso!");
    }

    public void removerVeiculo(String placa){
        Veiculo estacionado = new Veiculo(placa);
        veiculos.remove(estacionado);
        System.out.println("Veiculo removido com sucesso!");

    }

    public void consultarVeiculo(String placa){
        Veiculo buscarVeiculo = new Veiculo(placa);
        veiculos.contains(buscarVeiculo);
        System.out.println("Veiculo consultado com sucesso!");
    }

    public void listarVeiculos(){

        for(Veiculo lista : veiculos){
            System.out.println(lista);
        }

    }



}
