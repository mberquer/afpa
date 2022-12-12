package animal.test;
import animal.domain.*;

public class TestAnimal
{
    public static void main(String[] args)
    {
        Animal[] animaux = new Animal[3];
        animaux[0] = new Animal("Truc");
        animaux[1] = new Chien("Médor");
        animaux[2] = new Homme("Robert");
        for (Animal var : animaux) {System.out.println(var);var.parle();}
        animaux[0].setNom("idk man");
        System.out.println(animaux[0]);
    }
}
