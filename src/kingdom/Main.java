package kingdom; 

import java.util.*; 


public class Main {

    public static void printAnimals(ArrayList<AbstractAnimal> newAnimals, CheckAnimal tester) {

        for(AbstractAnimal a : newAnimals) {
            if (tester.test(a)) {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {

       //Mammals 
       MammalFromAbstract panda = new MammalFromAbstract("Panda", 1869); 
       MammalFromAbstract zebra = new MammalFromAbstract("Zebra", 1778); 
       MammalFromAbstract koala = new MammalFromAbstract("Koala", 1816); 
       MammalFromAbstract sloth = new MammalFromAbstract("Sloth", 1804); 
       MammalFromAbstract armadillo = new MammalFromAbstract("Armadillo", 1758);
       MammalFromAbstract raccoon = new MammalFromAbstract("Raccoon", 1758);
       MammalFromAbstract bigfoot = new MammalFromAbstract("Bigfoot", 2021); 

       //Birds
       BirdsFromAbstract pigeon = new BirdsFromAbstract("Pigeon", 1837);
       BirdsFromAbstract peacock = new BirdsFromAbstract("Peacock", 1821); 
       BirdsFromAbstract toucan = new BirdsFromAbstract("Toucan", 1758); 
       BirdsFromAbstract parrot = new BirdsFromAbstract("Parrot", 1824);
       BirdsFromAbstract swan =  new BirdsFromAbstract("Swan", 1758);
    
       //Fish
       FishFromAbstract salmon = new FishFromAbstract("Salmon", 1758);
       FishFromAbstract catfish = new FishFromAbstract("Catfish", 1817);
       FishFromAbstract perch = new FishFromAbstract("Perch", 1758);

       ArrayList<AbstractAnimal> animalList = new ArrayList<>(); 
       animalList.add(panda); 
       animalList.add(zebra); 
       animalList.add(koala); 
       animalList.add(sloth); 
       animalList.add(armadillo); 
       animalList.add(raccoon); 
       animalList.add(bigfoot); 
       animalList.add(pigeon); 
       animalList.add(peacock); 
       animalList.add(toucan); 
       animalList.add(parrot); 
       animalList.add(swan); 
       animalList.add(salmon); 
       animalList.add(catfish); 
       animalList.add(perch); 

       System.out.println("Descending order");
       animalList.sort((a1, a2) -> a2.getYearDisc() - a1.getYearDisc()); 
       animalList.forEach(a -> System.out.println(a));

       System.out.println();

       System.out.println("Alphabetical Order");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(a -> System.out.println(a)); 

       System.out.println();

        System.out.println("*** Animals that walk ***");
       printAnimals(animalList, a -> a.getMovement() == "walk");

       System.out.println();

       System.out.println("*** Animals that Fly ***");
       printAnimals(animalList, a -> a.getMovement() == "fly");

       System.out.println();

       System.out.println("*** Animals that Swim ***");
       printAnimals(animalList, a -> a.getMovement() == "swim");

       System.out.println();

       System.out.println("*** Animals that breath with Lungs ***");
       printAnimals(animalList, a -> a.getRespiratory() == "lungs");

       System.out.println();

       System.out.println("*** Lungs & 1758 ***");
       printAnimals(animalList, a -> a.getRespiratory() == "lungs" && a.getYearDisc() == 1758);

       System.out.println();

       System.out.println("*** Eggs & Lungs ***");
       printAnimals(animalList, a -> a.getReproduction() == "eggs" && a.getRespiratory() == "lungs");

       System.out.println();

       System.out.println("*** Alphabetically in 1758 ***");
       animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
       printAnimals(animalList, a -> a.getYearDisc() == 1758);

       System.out.println();

       System.out.println("*** STRETCH ***");
       printAnimals(animalList, a -> a.getReproduction() == "live births");
    }
}