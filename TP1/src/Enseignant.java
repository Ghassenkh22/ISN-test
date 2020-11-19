
public class Enseignant {
String nom,prenom;
float salaire;
int salaireh=30;

public Enseignant (String nom,String prenom,String type, int nbrh)
{this.nom=nom;
this.prenom=prenom;
if (type=="I")
salaire=2*salaireh*nbrh;
else if(type=="P")
	{if(nbrh>200)
		salaire=2000+salaireh*(nbrh-200);
	else salaire=2000;
	}
}

@Override
public String toString() {
	return "Enseignant [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
}


}
