package br.com.erp.enums.basic;

public enum TipoEndereco {
	
	EP("Endereço Pessoal"),
	EE("Endereço de Entrega"),
	EC("Endereco de Cobrança"),
	ECT("Endereço de Coleta");
	
	String tipoEndereco;
	
	TipoEndereco(String tipoEndereco){
		this.tipoEndereco = tipoEndereco;
	}
	
	public String getTipoEndereco(){
		return tipoEndereco;
	}

}
