package mongodb;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Pets {
    @Id
    public ObjectId id;

    public String name;
    public String species;
    public String breed;

    public Pets(){}

    public Pets(String name,String species,String breed){
        this.name = name;
        this.breed = breed;
        this.species = species;
    }

    // ObjectId needs to be converted to string
    public String get_id() { return id.toHexString(); }
    public void set_id(ObjectId _id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

}
