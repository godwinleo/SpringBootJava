package mongodb;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {
    @Autowired
    PetsRepository petsRepository;

    @RequestMapping("/")
    public List<Pets> getAll(){
        return petsRepository.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Pets getPetsById(@PathVariable("id") ObjectId id){
        return petsRepository.findById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void modifyById(@PathVariable("id")ObjectId id , @Valid @RequestBody Pets pets){
        pets.set_id(id);
        petsRepository.save(pets);
    }

    @RequestMapping(value="/",method=RequestMethod.POST)
    public Pets createPets(@Valid @RequestBody Pets pets){
        pets.set_id(ObjectId.get());
        petsRepository.save(pets);
        return pets;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePet(@PathVariable ObjectId id) {
        petsRepository.delete(petsRepository.findById(id));
    }

}
