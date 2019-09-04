package zoo; 

public abstract class AbstractAnimal {
    public String eatFood() {
        return "The animals all eat the same.";
    }

    private static int maxId = 0; 
    private String name; 
    private int id; 
    private int year; 
     

    public AbstractAnimal(String name, int year) {
        maxId++; 
        id = maxId;
        
        this.name = name; 
        this.year = year; 
    }
    
    public abstract String getName(); 
    public abstract int getYear(); 
    public abstract String getMovement(); 
    public abstract String getRespiratory(); 
    public abstract String getReproduction(); 

}