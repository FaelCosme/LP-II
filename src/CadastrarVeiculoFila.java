import java.util.ArrayList;

public class CadastrarVeiculoFila {

    private ArrayList<Veiculo> veiculos;

    public CadastrarVeiculoFila(){
        veiculos = new ArrayList<>();
    }


    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
        System.out.println("Veiculo adicionado com sucesso!");
    }

    public void removerVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }



}
