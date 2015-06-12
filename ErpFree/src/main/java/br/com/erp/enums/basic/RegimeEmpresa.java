package br.com.erp.enums.basic;

/**
 * @author carlos
 *
 */
public enum RegimeEmpresa {
	
	SN("Simples Nacional"),
	LR("Lucro Real"),
	LP("Lucro Presumido"),
	LA("Lucro Arbitral");
	
	String regimeEmpresa;
	
	private RegimeEmpresa(String regimeEmpresa) {
		this.regimeEmpresa = regimeEmpresa;
	}
    
	public String getRegimeEmpresa(){
		return regimeEmpresa;
	}
	
}
