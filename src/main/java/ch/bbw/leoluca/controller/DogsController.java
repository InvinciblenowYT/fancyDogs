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
    private DogsRepository dogsRepository;

    @GetMapping("/dogs")
    List<Dogs> all() {
        return dogsRepository.findAll();
    }

    @GetMapping("/dogs/colour={colour}+district={district}")
    List<Dogs> getDogsByColourAndDistrict(@PathVariable("colour") String colour, @PathVariable("district") String district) {
        return dogsRepository.dogsByColourAndDistrict(colour, Integer.parseInt(district));
    }

    @GetMapping("/dogs/samesex")
    List<Dogs> getDogsWithSameSexLikeOwner(){
        return dogsRepository.findDogsWithSameSexLikeOwner();
    }

    @GetMapping("/dogs/colour={colour}+page={page}")
    List<Dogs> getPagedDogsByColour(@PathVariable("colour") String colour, @PathVariable("page") String page) {
        return dogsRepository.findAllByHundefarbe(colour, PageRequest.of(Integer.parseInt(page), 10));
    }

    @GetMapping("/dogs/dogsex={dogsex}")
    List<Dogs> DogsBySex(@PathVariable("dogsex") String sex){
        return dogsRepository.findDogsByGeschlecht(sex);
    }

    @GetMapping("/dogs/ownergender={ownergender}")
    List<Dogs> DogsByOwnerGender(@PathVariable("ownergender") String gender){
        return dogsRepository.findDogsByOwnerGender(gender);
    }

    @GetMapping("/dogs/bornbefore={year}")
    List<Dogs> DogBornBefore(@PathVariable("year") String year){
        return dogsRepository.findDogsByGeburtsjahrBefore(Integer.parseInt(year));
    }

    @DeleteMapping("/delete/id={id}")
    List<Dogs> DeleteDogsById(@PathVariable("id") String id){
        return dogsRepository.deleteDogsById(Long.parseLong(id));
    }
}
