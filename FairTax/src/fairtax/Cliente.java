package fairtax;

public class Cliente {

    private String nome, sobrenome;
    private double moradia, alimentação, vestuario, transporte, educacao, assistenciaMedica, ferias, fairtax;

    public Cliente(String nome, String sobrenome, double moradia, double alimentação, double vestuario, double transporte, double educacao, double assistenciaMedica, double ferias, double fairtax) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.moradia = moradia;
        this.alimentação = alimentação;
        this.vestuario = vestuario;
        this.transporte = transporte;
        this.educacao = educacao;
        this.assistenciaMedica = assistenciaMedica;
        this.ferias = ferias;
        this.fairtax = fairtax;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public double getFairtax() {
        return this.fairtax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setMoradia(double moradia) {
        this.moradia = moradia;
    }

    public void setAlimentacao(double alimentacao) {
        this.alimentação = alimentacao;
    }

    public void setVestuario(double vestuario) {
        this.vestuario = vestuario;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }

    public void setEducacao(double educacao) {
        this.educacao = educacao;
    }

    public void setAssistenciaMedica(double assistenciaMedica) {
        this.assistenciaMedica = assistenciaMedica;
    }

    public void setFerias(double ferias) {
        this.ferias = ferias;
    }

    public void setFairTax(double fairtax) {
        this.fairtax = fairtax;
    }

    public double fairTax() {
        this.fairtax = (this.alimentação * 0.23) + (this.assistenciaMedica * 0.23) + (this.educacao * 0.23) + (this.ferias * 0.23) + (this.moradia * 0.23) + (this.transporte * 0.23) + (this.vestuario * 0.23);
        return this.fairtax;
    }
}
