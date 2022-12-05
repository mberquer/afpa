package bookstore.metier;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Livre implements Comparable<Livre>
{
    private String titre, auteur;
    private int nbPages;
    private double prix=-1;
    DecimalFormat df = new DecimalFormat("#,###.##");
    private static Comptable comptable = new Comptable();
    private Status available;
    private Date dataAchat;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Livre(){}
    public Livre(String unTitre, String unAuteur) {setTitre(unTitre);setAuteur(unAuteur);}
    public Livre(String unTitre, String unAuteur, int desPages) {setTitre(unTitre);setAuteur(unAuteur);setNbPages(desPages);}
    public Livre(String unTitre, String unAuteur, int desPages, double unPrix) {setTitre(unTitre);setAuteur(unAuteur);setNbPages(desPages);setPrix(unPrix);}
    public Livre(String unTitre, String unAuteur, int desPages, double unPrix, String uneDate) throws ParseException {setTitre(unTitre);setAuteur(unAuteur);setNbPages(desPages);setPrix(unPrix);setDate(uneDate);}

    public void setNbPages(int n){if(n<0){System.err.println("nbPages cant be negative");return;}nbPages = n;}
    public void setAuteur(String s){auteur = s;}
    public void setTitre(String s){titre = s;}
    public void setPrix(double i){if(i < 0.0){System.err.println("Prix ne peut pas etre negatif");return;}prix = i - prix;comptable.comptabilise(this);prix = i;}
    public void setDate(String uneDate) throws ParseException {dataAchat = sdf.parse(uneDate);}
    public void setStatus(Status status){available = status;}

    public String getAuteur(){return auteur;}
    public String getTitre(){return titre;}
    public int getNbPages(){return nbPages;}
    public double getPrix(){return Double.parseDouble(df.format(prix));}
    public Status getAvailable(){return available;}
    public static double getPrixTotal(){return comptable.getPrixTotal();}
    public void afficheToi(){System.out.println(toString());}
    public String toString()
    {
        if(prix>0) {return ("Titre: "+getTitre()+"\nAuteur :"+getAuteur()+"\nPages :"+getNbPages()+"\nPrix :"+getPrix());}
        return ("Titre: "+getTitre()+"\nAuteur :"+getAuteur()+"\nPages :"+getNbPages()+"\nPrix :Prix indeterminé");
    }

    public int compare(Livre l)
    {
        if(this.getNbPages() > l.getNbPages()){return(1);}
        if(this.getNbPages() < l.getNbPages()){return(-1);}
        return(0);

    }
    public static int compare2(Livre l1, Livre l2)
    {
        if(l1.getPrix() > l2.getNbPages()){return(1);}
        if(l1.getPrix() < l2.getNbPages()){return(-1);}
        return(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return nbPages == livre.nbPages && Double.compare(livre.prix, prix) == 0 && available == livre.available && Objects.equals(titre, livre.titre) && Objects.equals(auteur, livre.auteur) && Objects.equals(df, livre.df) && Objects.equals(dataAchat, livre.dataAchat) && Objects.equals(sdf, livre.sdf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, auteur, nbPages, prix, df, available, dataAchat, sdf);
    }

    public int compareTo(Livre livre) {return compare(livre);}
}