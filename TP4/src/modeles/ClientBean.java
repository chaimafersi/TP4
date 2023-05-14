package modeles;

public class ClientBean {
	private String nom;
	private String prénom;
	private String Adresse;
	private String Numero;
    private String email;

	public ClientBean(){
		setNom("");
		setPrénom("");
		setAdresse("");
		setNumero("");
		setEmail("");
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String Numero) {
		this.Numero=Numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom=prénom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
    this.Adresse=adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
	    this.email=email;
		}
	}

