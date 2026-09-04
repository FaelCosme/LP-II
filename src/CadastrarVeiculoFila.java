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

        veiculos.remove(placa);
    }

    public void consultarVeiculo(String placa){

        veiculos.contains(placa);
    }

    public void listarVeiculos(){

        for(Veiculo lista : veiculos){
            System.out.println(lista);
        }

    }



}
