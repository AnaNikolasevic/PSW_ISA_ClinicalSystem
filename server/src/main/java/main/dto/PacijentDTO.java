package main.dto;

import javax.persistence.Column;

import main.model.AdministratorKlinike;
import main.model.Pacijent;

public class PacijentDTO {
		
   private Long id;
   private String ime;
   private String prezime;
   private String email;
   private String lozinka;
   private String adresa;
   private String grad;
   private String drzava;
   private String telefon;
   private String jmbg;
   private Long idZdravstveniKarton;


public PacijentDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public PacijentDTO(Long id, String ime, String prezime, String email, String lozinka, String adresa, String grad,
		String drzava, String telefon, String jmbg, Long idZdravstveniKarton) {
	super();
	this.id = id;
	this.ime = ime;
	this.prezime = prezime;
	this.email = email;
	this.lozinka = lozinka;
	this.adresa = adresa;
	this.grad = grad;
	this.drzava = drzava;
	this.telefon = telefon;
	this.jmbg = jmbg;
	this.idZdravstveniKarton = idZdravstveniKarton;
}

public PacijentDTO(Pacijent pacijent) {
	super();
	this.id = pacijent.getId();
	this.ime = pacijent.getIme();
	this.prezime = pacijent.getPrezime();
	this.email = pacijent.getEmail();
	this.lozinka = pacijent.getLozinka();
	this.adresa = pacijent.getAdresa();
	this.grad = pacijent.getGrad();
	this.drzava = pacijent.getDrzava();
	this.telefon = pacijent.getTelefon();
	this.jmbg = pacijent.getJmbg();
	if(pacijent.getZdravstveniKarton()==null)
		this.idZdravstveniKarton=null;
	else
		this.idZdravstveniKarton = pacijent.getZdravstveniKarton().getId();

}


public Long getIdZdravstveniKarton() {
		return idZdravstveniKarton;
	}

public void setIdZdravstveniKarton(Long idZdravstveniKarton) {
		this.idZdravstveniKarton = idZdravstveniKarton;
	}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	this.ime = ime;
}

public String getPrezime() {
	return prezime;
}

public void setPrezime(String prezime) {
	this.prezime = prezime;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLozinka() {
	return lozinka;
}

public void setLozinka(String lozinka) {
	this.lozinka = lozinka;
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

public String getGrad() {
	return grad;
}

public void setGrad(String grad) {
	this.grad = grad;
}

public String getDrzava() {
	return drzava;
}

public void setDrzava(String drzava) {
	this.drzava = drzava;
}

   
public String getTelefon() {
	return telefon;
}

public void setTelefon(String telefon) {
	this.telefon = telefon;
}


public String getJmbg() {
	return jmbg;
}

public void setJmbg(String jmbg) {
	this.jmbg = jmbg;
}



  
}
