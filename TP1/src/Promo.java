import java.util.Arrays;

public class Promo {
int compteur=0;
int compteur2=0;
int nbr;
int nbr2;
Etudiant[] tab;
String nom;
Enseignant[] tab2;


 public Promo (String nom,int nbr,int nbr2)
{this.nbr=nbr;
this.nbr=nbr;
this.nom=nom;
tab= new Etudiant[nbr];
tab2= new Enseignant[nbr2];}


public void ajouter(Etudiant E)
{tab[compteur]=E;
compteur++;
}
public void ajouter(Enseignant E)
{tab2[compteur2]=E;
compteur2++;
}

@Override
public String toString() {
	return "Promo [tab=" + Arrays.toString(tab) +" "+Arrays.toString(tab2) + ", nom=" + nom +"]";
}


}
