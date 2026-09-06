import java.util.ArrayList;

public class CadastrarVeiculoFila {

    private ArrayList<Veiculo> veiculos;

    public CadastrarVeiculoFila() {
        veiculos = new ArrayList<>();
    }


    public void adicionarVeiculo(String placa) {
        Veiculo novo = new Veiculo(placa);
        veiculos.add(novo);
        System.out.println("Veiculo adicionado com sucesso!");
    }

    public void removerVeiculo(String placa) {
        for (Veiculo v : veiculos) { // Percorre a lista real
            if (v.getPlaca().equals(placa)) { // Compara a placa de cada um
                veiculos.remove(v);
                System.out.println("Veiculo removido com sucesso!");
                return;
            }
        }
        System.out.println("Veiculo não encontrado!");

    }

    public void consultarVeiculo(String placa) {
        for (Veiculo v : veiculos) { // Percorre a lista real
            if (v.getPlaca().equals(placa)) { // Compara a placa de cada um
                System.out.println("Veículo encontrado: " + v);
                return;
            }
        }
        System.out.println("Veículo não encontrado!");

    }

    public void listarVeiculos() {

        for (Veiculo lista : veiculos) {
            System.out.println(lista);
        }

    }


}
