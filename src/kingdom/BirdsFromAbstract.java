package kingdom; 

public class BirdsFromAbstract extends AbstractAnimal {

    public BirdsFromAbstract(String name, int yearDisc) {

        super(name, yearDisc); 
        
    }

    @Override
    public String getMovement() {

        return "fly"; 
    } 

    @Override
    public String getRespiratory() {

        return "lungs"; 
    }

    @Override
    public String getReproduction() {

        return "eggs"; 
    }
}