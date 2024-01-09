package main;

import DAO.IProduit;
import DAO.ProduitInpl;

public class Main {
    public static void main(String[] args) {
        IProduit iProduit  =new ProduitInpl();
       iProduit.affichage(iProduit.saisie());
    }
}