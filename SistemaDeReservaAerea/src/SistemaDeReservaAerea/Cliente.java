package SistemaDeReservaAerea;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String nascimento;
	private String sexo;
	private String pais;
	private int passaporte;
	private String telefone;
	private String nomeMae;
	private String nomePai;
	private String[] filhos;
	private int assento;
	private int id;

	public Cliente(String nome, String sobrenome, String nascimento, String sexo, String pais, int passaporte,
			String telefone, int id) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nascimento = nascimento;
		this.assento = assento;
		this.sexo = sexo;
		this.pais = pais;
		this.passaporte = passaporte;
		this.telefone = telefone;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQuantiFilhos(int num) {
		this.filhos = new String[num];
	}

	public void setFilhos(String nome, int i) {
		this.filhos[i] = nome;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setPassaporte(int passaporte) {
		this.passaporte = passaporte;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void getFilhos() {
		System.out.println("Filho(a)(s)");
		for (String v : this.filhos) {
			System.out.printf("Nome: %s%n", v);
		}
	}

	public String getNascimento() {
		return nascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public String getPais() {
		return pais;
	}

	public int getPassaporte() {
		return passaporte;
	}

	public String getSexo() {
		return sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setId() {
		this.id++;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public int getId() {
		return id;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public int getAssento() {
		return assento;
	}

	public String[] getQFilhos() {
		return this.filhos;
	}
}
