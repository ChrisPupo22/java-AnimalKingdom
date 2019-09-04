package zoo;
import java.util.*; 

public class Main {

    public static void main(String[] args) {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816); 
        Mammal sloth = new Mammal("Sloth", 1804); 
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021); 
        
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821); 
        Bird toucan = new Bird("Parrot", 1824); 
        Bird swan = new bird("Swan", 1758); 

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817); 
        Fish Perch = new Fish("Perch", 1758); 
    }
}