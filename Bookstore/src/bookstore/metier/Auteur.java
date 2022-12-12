package bookstore.metier;

public class Auteur extends Personne
{
    public Auteur(){}
    public Auteur(String n, String p){super(n, p);}

    public void parle(){System.out.println("je suis un auteur");}

    public String toString() {return super.toString();}
}
