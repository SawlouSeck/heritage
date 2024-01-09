package DAO;

import Entity.Produit;

import java.util.Scanner;

public class ProduitInpl implements IProduit {

    @Override
    public Produit saisie() {
        Produit p = new Produit();
        Scanner clavier = new  Scanner(System.in);
        System.out.println("Donner la reference ");
        p.setRef(clavier.nextLine());
        System.out.println("Donner le libelle");
        p.setLibelle(clavier.nextLine());
       do {
           System.out.println("Donner la quantite");
                   p.setQuantite(clavier.nextDouble());
       }while (p.getQuantite()<1);
        do {
            System.out.println("Donner le prix");
            p.setPrix(clavier.nextInt());
        }while (p.getPrix()<0);

        return p;
    }

    @Override
    public void affichage(Produit p) {
        System.out.println("reference" + p.getRef());
        System.out.println("libelle" + p.getLibelle());
        System.out.println("quantite" + p.getQuantite());
        System.out.println("Prix" + p.getPrix());
    }
}
