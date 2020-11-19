
public class Etudiant {
	
	int noEt, age;
	
	String nom,prenom;
	static int compteur=1;
	public Etudiant(String nom,String prenom,int age)
	{	this.nom=nom;
	this.prenom=prenom;
	this.age=age;
	noEt=compteur;
	compteur++;}
	@Override
	public String toString() {
		return "Etudiant [ nom=" + nom + ", prenom=" + prenom +", noEt=" + noEt + ", age=" + age + "]";
	}
	
	

}
