package kingdom; 

public abstract class AbstractAnimal {

    private int id; 
    private static int maxId = 0; 
    private String name;
    private int yearDisc; 


    public AbstractAnimal(String name, int yearDisc) {

        id = maxId++; 

        this.name = name; 
        this.yearDisc = yearDisc; 

    }

    public String getName() {

        return name; 
    }

    public int getYearDisc() {

        return yearDisc; 
    } 

    public abstract String getMovement(); 
    public abstract String getRespiratory(); 
    public abstract String getReproduction(); 

    @Override
    public String toString() {

        return "AbstractAnimal{" +
        "name:'" + name + '\'' + 
        ", yearDisc: " + yearDisc + 
        '}';
    }
}