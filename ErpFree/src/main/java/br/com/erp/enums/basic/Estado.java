package br.com.erp.enums.basic;

public enum Estado {
	
	AC("Acre"),
	AL("Alagoas"),
	AM("Amazonas"),
	AP("Amapá"),
	BA("Bahia"),
	CE("Ceará"),
	DF("Distrito Federal"),
	ES("Esprito Santo"),
	GO("Goias"),
	MA("Maranhão"),
	MG("Minas Gerais"),
	MS("Mato Grosso do Sul"),
    MT("Mato Grosso"),
	PA("Pará"),
	PB("Paraiba"),
	PE("Pernambuco"),
	PI("Piauí"),
	PR("Paraná"),
	RJ("Rio de Janeiro"),
	RN("Rio Grande do Norte"),
	RO("Rondonia"),
	RR("Roraima"),
	RS("Rio Grande do Sul"),
	SC("Santa Catarina"),
	SE("Sergipe"),
	SP("São Paulo"),
	TO("Tocantins");
	
	String estado;
	
	Estado(String estado){
		this.estado = estado;
	}
	
	public String getEstado(){
		return estado;
	}

}
