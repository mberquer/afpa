package bookstore.metier;

public abstract class Personne implements Nommable, Barvard
{
    private String nom;
    private String prenom;

    public Personne(){}
    public Personne(String n, String p){setNom(n);setPrenom(p);}

    public void setNom(String nom){this.nom = nom;}
    public void setPrenom(String prenom){this.prenom = prenom;}

    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}

    public abstract void parle();
    public String ToString(){return ("Nom: "+nom+"Prénom: "+prenom);}
}
