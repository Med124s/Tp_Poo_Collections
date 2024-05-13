package org.enset.Model.Ex3;

import java.util.HashSet;
import java.util.Set;

public class GestionGroupes {
    public static void main(String[] args) {
        // Création des deux sets pour les groupes A et B
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // Ajouter des noms d'étudiants à chaque HashSet
        groupeA.add("Alice");
        groupeA.add("Bob");
        groupeA.add("Charlie");
        groupeA.add("David");

        groupeB.add("Charlie");
        groupeB.add("Eve");
        groupeB.add("Frank");
        groupeB.add("Grace");

        // Afficher l'intersection des deux HashSets
        System.out.println("Intersection des deux groupes :");
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        afficherElements(intersection);

        // Afficher l'union des deux HashSets
        System.out.println("\nUnion des deux groupes :");
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        afficherElements(union);
    }

    // Méthode pour afficher les éléments d'un Set
    private static void afficherElements(Set<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}