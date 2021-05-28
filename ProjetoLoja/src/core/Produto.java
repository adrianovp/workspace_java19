package core;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;

	/*
	 * M�todo CONSTRUTOR
	 * 
	 * Esse m�todo s� � chamado no momento do NEW (na constru��o do objeto na
	 * mem�ria)
	 * 
	 * Em geral � usado para definir valores iniciais aos atributos
	 */
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Produto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = 0;
	}

	public double aplicarDesconto(double porcentagem) {
		double novoPreco = preco - preco * porcentagem / 100;
		return novoPreco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
