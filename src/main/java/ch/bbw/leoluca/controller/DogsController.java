package ch.bbw.leoluca.controller;

import ch.bbw.leoluca.model.Dogs;
import ch.bbw.leoluca.repository.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DogsController {
    @Autowired
    private final DogsRepository dogsRepository;

    public DogsController(DogsRepository dogsRepository) {
        this.dogsRepository = dogsRepository;
    }

    @GetMapping("/dogs")
    List<Dogs> all() {
        return dogsRepository.findAll();
    }

    @GetMapping("/dogs/colour={colour}+district={district}")
    List<Dogs> getDogsByColourAndDistrict(@PathVariable("colour") String colour, @PathVariable("district") String district) {
        return dogsRepository.dogsByColourAndDistrict(colour, Integer.parseInt(district));
    }

    @GetMapping("/dogs/colour={colour}+page={page}")
    List<Dogs> getPagedDogsByColour(@PathVariable("colour") String colour, @PathVariable("page") String page) {
        return dogsRepository.findAllByHundefarbe(colour, PageRequest.of(Integer.parseInt(page), 10));
    }

    @GetMapping("/dogs/year={year}")
    List<Dogs> DogsByYear(@PathVariable("year") String year){
        return dogsRepository.dogsByYear(Integer.parseInt(year));
    }

    @GetMapping("/dogs/dogsex={dogsex}")
    List<Dogs> DogsBySex(@PathVariable("dogsex") String sex){
        return dogsRepository.dogsBySex(sex);
    }

    @GetMapping("/dogs/ownergender={ownergender}")
    List<Dogs> DogsByOwnerGender(@PathVariable("ownergender") String gender){
        return dogsRepository.dogsByOwnerGender(gender);
    }

    @GetMapping("/dogs/bornbefore={year}")
    List<Dogs> DogBornBefore(@PathVariable("year") String year){
        return dogsRepository.dogsBornBefore(Integer.parseInt(year));
    }

    @DeleteMapping("/delete/id={id}")
    List<Dogs> DeleteDogsById(@PathVariable("id") String id){
        return dogsRepository.deleteDogsById(Long.parseLong(id));
    }



}
