package animal.domain;

public class Chien extends Mammifere
{
    public Chien(){}
    public Chien(String unNom){super(unNom);}

    public void parle(){System.out.println(getNom()+" parle: woufwouf");}
    public String toString(){return(super.toString()+"Je suis un chien.");}
}
