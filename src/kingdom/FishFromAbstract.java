package kingdom; 

public class FishFromAbstract extends AbstractAnimal {

    public FishFromAbstract(String name, int yearDisc) {

        super(name, yearDisc); 
    }

    @Override
    public String getMovement() {

        return "swim"; 
    } 

    @Override
    public String getRespiratory() {

        return "gills"; 
    }

    @Override
    public String getReproduction() {

        return "eggs"; 
    }
}