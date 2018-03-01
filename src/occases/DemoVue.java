package occases;


public class DemoVue {
    public static void main(String[] args) {
        GarageVue gv=new GarageVue();
        gv.affMsg("salut");
        Voiture v =new Voiture("111","AAA","AAA",111,111,111);
        gv.affMsg(v);
        gv.affMsg("nom :");
        String nom=gv.getMsg();
        gv.affMsg("le nom encode est "+nom);
        String tel=gv.getMsg("tel :");
        gv.affMsg("le telephone encode est "+tel);
        String numchassis = gv.getMsg("numéro de chassis : ");
        String marque = gv.getMsg("marque : ");
        String modele = gv.getMsg("numéro modèle : ");
        String kms = gv.getMsg("km : ");
        String ans = gv.getMsg("année : ");
        String prixs = gv.getMsg("prix : ");
       
                
      }
}
