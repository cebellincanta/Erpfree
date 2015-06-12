package br.com.erp.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.erp.dao.jpa.dao.EmpresaDAO;
import br.com.erp.entidades.basic.Empresa;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	
	private EmpresaDAO empresaDAO = new EmpresaDAO(); 

	@RequestMapping(value = "/inserir", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseStatus(value = HttpStatus.CREATED) 
	private String incluirEmpresa(@ModelAttribute("empresa")  Empresa empresa){
	    empresaDAO.save(empresa);
		return "/empresa";

	}
	

	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/api/empresas", method = RequestMethod.GET)
	public String listEmpresaJson(){
		 JSONArray empresaArray = new JSONArray();
		 List<Empresa> empresaList = empresaDAO.list("empresa.list");
		 for(Empresa empresa: empresaList){
			 JSONObject empresaJSON = new JSONObject();
			 empresaJSON.put("id", empresa.getId());
			 empresaJSON.put("bairro", empresa.getBairro());
			 empresaJSON.put("cep", empresa.getCep());
			 empresaJSON.put("cidade", empresa.getCidade());
			 empresaJSON.put("cnpj", empresa.getCnpj());
			 empresaJSON.put("complemento", empresa.getComplemento());
	         empresaJSON.put("endereco", empresa.getEndereco());
	         empresaJSON.put("estado", empresa.getEstado());
	         empresaJSON.put("inscricaoEstadual", empresa.getInscricaoEstadual());
	         empresaJSON.put("inscricaoMunicipal", empresa.getInscricaoMunicipal());
	         empresaJSON.put("matriz", empresa.isMatriz());
	         empresaJSON.put("nomeFantasia", empresa.getNomeFantasia());
	         empresaJSON.put("numero", empresa.getNumero());
	         empresaJSON.put("razaoSocial", empresa.getRazaoSocial());
	         empresaJSON.put("regime", empresa.getRegimeEmpresa().getRegimeEmpresa());
	         empresaJSON.put("telefone", empresa.getTelefone());
			 empresaArray.put(empresaJSON);
		 }
		 
		 System.out.print(empresaArray.toString());
		 return empresaArray.toString();
		
	}
	
  
}
