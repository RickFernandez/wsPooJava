package br.com.heranca.beans;

public class Livro extends Produto{
	private String editora;
	private String ISBN;
	private String autor;
	private int volume;
	private boolean capaDura;
	
	@Override
	public String toString() {
		return super.toString() + "Livro [editora=" + editora + ", ISBN=" + ISBN + ", autor=" + autor + ", volume=" + volume
				+ ", capaDura=" + capaDura + "]";
	}

	public double calcularImposto() {
		return getValorCompra() * 0.05;
	}
	
	public Livro() {
		super();
	}
	
	public Livro(int id, String titulo, double valorCompra, double valorVenda, double valorPromocional, int qtde,
			boolean lancamento, String estilo, String editora, String iSBN, String autor, int volume,
			boolean capaDura) {
		super(id, titulo, valorCompra, valorVenda, valorPromocional, qtde, lancamento, estilo);
		this.editora = editora;
		ISBN = iSBN;
		this.autor = autor;
		this.volume = volume;
		this.capaDura = capaDura;
	}
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isCapaDura() {
		return capaDura;
	}
	public void setCapaDura(boolean capaDura) {
		this.capaDura = capaDura;
	}
	
}
