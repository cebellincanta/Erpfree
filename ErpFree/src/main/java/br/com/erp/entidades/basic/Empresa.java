package br.com.erp.entidades.basic;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.com.erp.enums.basic.Estado;
import br.com.erp.enums.basic.RegimeEmpresa;

@Entity
@JsonPropertyOrder({"bairro"})
@SequenceGenerator(name="empresa_id_seq" ,sequenceName="empresa_id_seq", allocationSize=1 ,initialValue=1)
@NamedQueries({
    @NamedQuery(name="empresa.list", query="select emp from Empresa emp ORDER BY emp.id"),
    @NamedQuery(name="empresa.id", query="select emp from Empresa emp where emp.id = :id")
})
public class Empresa implements Serializable {
    
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)    
	@Column(name = "id")
	private long id;
	@Column(name = "razaoSocial", length = 150)
	private String razaoSocial;
	@Column(name = "nomeFantasia", length = 150)
	private String nomeFantasia;
	@Column(name = "cnpj", length = 22)
	private String cnpj;
	@Column(name = "inscricaoEstadual", length = 25)
	private String inscricaoEstadual;
	@Column(name = "inscricaoMunicipal", length = 25)
	private String inscricaoMunicipal;
	@Column(name = "endereco", length = 100)
	private String endereco;
	@Column(name = "numero", length = 10)
	private String numero;
	@Column(name = "complemento",length = 20)
	private String complemento;
	@Column(name = "bairro", length = 30)
	private String bairro;
	@Column(name = "cidade", length = 50)
	private String cidade;
	@Enumerated(EnumType.STRING)
	private Estado estado;
	@Column(name = "cep", length = 11)
	private String cep;
	@Column(name = "telefone", length = 20)
	private String telefone;
	@Column(name = "matriz")
	private boolean matriz;
	@Enumerated(EnumType.STRING)
	private RegimeEmpresa regimeEmpresa;
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	@Temporal(TemporalType.DATE)
	private Date dataFundacao;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isMatriz() {
		return matriz;
	}
	public void setMatriz(boolean matriz) {
		this.matriz = matriz;
	}
	public RegimeEmpresa getRegimeEmpresa() {
		return regimeEmpresa;
	}
	public void setRegimeEmpresa(RegimeEmpresa regimeEmpresa) {
		this.regimeEmpresa = regimeEmpresa;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
}
