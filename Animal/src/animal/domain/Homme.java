package animal.domain;

public class Homme extends Mammifere
{
    public Homme(){}
    public Homme(String unNom){super(unNom);}

    public void parle() {System.out.println(getNom()+" parle: polymorphisme.");}
    public String toString() {return (super.toString()+"Je suis un Homme.");}
}
