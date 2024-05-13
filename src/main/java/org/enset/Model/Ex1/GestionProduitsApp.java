package org.enset.Model.Ex1;
import java.util.ArrayList;
import java.util.Scanner;
public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> listeProduits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ajouter des produits
        listeProduits.add(new Produit(1, "Produit 1", 10.5));
        listeProduits.add(new Produit(2, "Produit 2", 20.0));
        listeProduits.add(new Produit(3, "Produit 3", 30.75));

        // Afficher la liste des produits
        System.out.println("Liste des produits :");
        afficherListeProduits(listeProduits);

        // Supprimer un produit par indice
        int indiceASupprimer = 1; // Exemple : supprimer le produit à l'indice 1
        if (indiceASupprimer >= 0 && indiceASupprimer < listeProduits.size()) {
            listeProduits.remove(indiceASupprimer);
            System.out.println("Produit supprimé avec succès.");
        } else {
            System.out.println("Indice invalide. Aucun produit supprimé.");
        }

        // Afficher à nouveau la liste des produits après la suppression
        System.out.println("\nListe des produits après suppression :");
        afficherListeProduits(listeProduits);

        // Modifier un produit par indice
        int indiceAModifier = 0; // Exemple : modifier le produit à l'indice 0
        if (indiceAModifier >= 0 && indiceAModifier < listeProduits.size()) {
            Produit produitAModifier = listeProduits.get(indiceAModifier);
            System.out.println("\nModifier le produit à l'indice " + indiceAModifier + " : " + produitAModifier);

            System.out.print("Nouveau nom : ");
            String nouveauNom = scanner.nextLine();
            System.out.print("Nouveau prix : ");
            double nouveauPrix = scanner.nextDouble();

            produitAModifier.setNom(nouveauNom);
            produitAModifier.setPrix(nouveauPrix);

            System.out.println("Produit modifié avec succès.");
        } else {
            System.out.println("Indice invalide. Aucun produit modifié.");
        }

        // Afficher à nouveau la liste des produits après la modification
        System.out.println("\nListe des produits après modification :");
        afficherListeProduits(listeProduits);

        // Rechercher un produit par nom
        System.out.print("\nRechercher un produit par nom : ");
        String nomRecherche = scanner.next();
        rechercherProduitParNom(listeProduits, nomRecherche);
    }

    // Méthode pour afficher la liste des produits
    private static void afficherListeProduits(ArrayList<Produit> listeProduits) {
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }
    }

    // Méthode pour rechercher un produit par nom
    private static void rechercherProduitParNom(ArrayList<Produit> listeProduits, String nomRecherche) {
        boolean produitTrouve = false;
        for (Produit produit : listeProduits) {
            if (produit.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Produit trouvé : " + produit);
                produitTrouve = true;
            }
        }
        if (!produitTrouve) {
            System.out.println("Aucun produit trouvé avec le nom \"" + nomRecherche + "\".");
        }
    }
}