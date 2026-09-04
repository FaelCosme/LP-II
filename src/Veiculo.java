public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;

    // Construtor padrão
    public Veiculo() {}

    // Contrutor parametrizado (em cascatas):

    public Veiculo(String placa){
        this.placa = placa;
    }

    public Veiculo(String placa, String modelo){
        this.modelo = modelo;
        this.placa = placa;
    }

    public Veiculo(String placa, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Veiculo(String placa, String marca, String modelo, String cor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return placa;
    }
}
