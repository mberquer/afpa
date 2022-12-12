package animal.domain;

public class Animal implements Nommable, Comparable<Animal> {
    private String nom;

    public Animal(){}
    public Animal(String unNom){setNom(unNom);}

    public String getNom(){return nom;}

    public void setNom(String nom){this.nom = nom;}
    public String toString() {return ("Je suis un animal de nom "+getNom()+". ");}
    public void parle(){System.out.println(getNom()+" parle brrrrrrrrrrrrrrrrr");}

    public int compareTo(Animal anAnimal)
    {
        if(this.getNom().compareTo(anAnimal.getNom())>0){return(1);}
        if(this.getNom().compareTo(anAnimal.getNom())<0){return(-1);}
        return(0);
    }
}
