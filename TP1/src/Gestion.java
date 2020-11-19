import java.util.ArrayList;
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Etudiant ET1= new Etudiant("khedher","ghassen",22);
Etudiant ET2= new Etudiant("zghal","Ahmed",22);
Etudiant ET3= new Etudiant("Guirguis","cyril",22);
Enseignant EN1=new Enseignant("mikel","alain","I",180);
Enseignant EN2=new Enseignant("jean","christhophe","P",180);
Enseignant EN3=new Enseignant("mario","didier","P",230);

Promo p1=new Promo("ISN",3,2);
p1.ajouter(ET1);
p1.ajouter(ET2);
p1.ajouter(ET2);
p1.ajouter(EN1);
p1.ajouter(EN2);
System.out.println(p1.toString());
/*System.out.println(EN1.toString());
System.out.println(EN2.toString());
System.out.println(EN3.toString());*/

/*String affiche=ET1.toString();
System.out.println(affiche);
System.out.println(ET2.toString());*/


	}

}
