package animal.domain;

public class Mammifere extends Animal
{
    public Mammifere(){}
    public Mammifere(String unNom){super(unNom);}
    public String toString() {return (super.toString()+"Je suis un mammifère. ");}
}
