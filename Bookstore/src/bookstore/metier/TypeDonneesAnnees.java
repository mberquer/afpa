package bookstore.metier;

import java.util.Objects;

public class TypeDonneesAnnees
{
    int annee;

    public TypeDonneesAnnees(){}
    public TypeDonneesAnnees(int i){setAnnee(i);}

    public void setAnnee(int i){annee = i;}

    public int getAnnee(){return annee;}
    public String ToString(){return("Année: "+getAnnee());}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeDonneesAnnees that = (TypeDonneesAnnees) o;
        return annee == that.annee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(annee);
    }
}
