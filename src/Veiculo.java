public class Veiculo {
    private String cor;
    public String modelo;
    private String marca;
    float capacidadedeTanque;
    int qtdPorta;
    int velocidade;

    public void acelerar(){
        velocidade = velocidade +1;
    }

    public void parar(){
        velocidade = velocidade -1;
    }

    public String buzina(){
        return "Bi-Bi!";
    }
}
