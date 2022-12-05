package bookstore.metier;

public class Comptable
{
    double prixTotal = 0;

    public void comptabilise(Livre unlivre){prixTotal+= unlivre.getPrix();}

    public double getPrixTotal(){return prixTotal;}
}
