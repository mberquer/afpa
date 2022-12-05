package bookstore.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utilisateur implements Nommable, Barvard {
    private String nom;
    private String prenom;
    private int idUtilisateur;
    private Livre livre;
    private Date dateEmprunt;
    private static int dureeMaxPret = 15;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Utilisateur(){}
    public Utilisateur(Livre unLivre, String uneDate) throws ParseException {livre = unLivre;dateEmprunt = sdf.parse(uneDate);}
    public Utilisateur(String unNom, String unPrenom, int id, Livre unLivre, String uneDate) throws ParseException {setNom(unNom);setPrenom(unPrenom);setIdUtilisateur(id);setLivre(unLivre);setDateEmprunt(uneDate);}

    @Override
    public void setNom(String unNom){nom = unNom;}
    public void setPrenom(String unPrenom){prenom = unPrenom;}
    public void setIdUtilisateur(int id){idUtilisateur = id;}
    public void setLivre(Livre unLivre){livre = unLivre;}
    public void setDateEmprunt(String uneDate) throws ParseException {dateEmprunt = sdf.parse(uneDate);}

    @Override
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public int getIdItulisateur(){return idUtilisateur;}
    public Livre getLivre(){return livre;}
    public Date getDateEmprunt(){return dateEmprunt;}
    public boolean isPretEnRetard()
    {
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(this.getDateEmprunt());
        c.add(Calendar.DATE, 15);
        if (today.after(c.getTime()))
            return true;
        return false;
    }
    public void parle() {System.out.println("blabla");}
}
