package zoo; 

public class Mammal extends AbstractAnimal {
    private String name; 


    public Mammal(String name, int year,int id) {
        super(id);
        this.name = name; 
    
    }
    



    public String getName() {
        return name; 
    }

    public void setName() {
        this.name = name; 
    }


}