package modeles;

public class ClientBean {
	private String nom;
	private String pr�nom;
	private String Adresse;
	private String Numero;
    private String email;

	public ClientBean(){
		setNom("");
		setPr�nom("");
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
	public String getPr�nom() {
		return pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		this.pr�nom=pr�nom;
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

