package kingdom;


public class MammalFromAbstract extends AbstractAnimal {

    public MammalFromAbstract(String name, int yearDisc) {

        super(name, yearDisc);
         
    }

    @Override
    public String getMovement() {

        return "walk"; 
    } 

    @Override
    public String getRespiratory() {

        return "lungs"; 
    }

    @Override
    public String getReproduction() {

        return "live births"; 
    }
}