package model;

public class TipoCausa {

	
	private int idTipo;
	private String idNome;
	public TipoCausa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoCausa(int idTipo, String idNome) {
		super();
		this.idTipo = idTipo;
		this.idNome = idNome;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getIdNome() {
		return idNome;
	}
	public void setIdNome(String idNome) {
		this.idNome = idNome;
	}
	
	
}
