package ch.bbw.leoluca;

import ch.bbw.leoluca.model.Dogs;
import ch.bbw.leoluca.repository.DogsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Transactional
@SpringBootTest
class LeoLucaApplicationTests {
    @Autowired
    private DogsRepository dogsRepository;

    @Test
    void contextLoads() {
    }

    @Test void testDogsByColourAndDistrict(){
        assertEquals(63, dogsRepository.dogsByColourAndDistrict("braun", 10).size());
    }

    @Test void testfindAllByHundefarbe(){
        assertEquals(10, dogsRepository.findAllByHundefarbe("braun", PageRequest.of(1, 10)).size());
    }

    @Test void testfindDogsWithSameSexLikeOwner(){
        assertEquals(4532, dogsRepository.findDogsWithSameSexLikeOwner().size());
    }

    @Test void testfindDogsByOwnerGender(){
        assertEquals(2663, dogsRepository.findDogsByOwnerGender("m").size());
    }

    @Test void testfindDogsByGeburtsjahrBefore(){
        assertEquals(3057, dogsRepository.findDogsByGeburtsjahrBefore(2013).size());
    }

    @Test void testfindDogsByGeschlecht(){
        assertEquals(4291, dogsRepository.findDogsByGeschlecht("m").size());
    }

    @Test void testdeleteDogsById(){
        assertEquals(1, dogsRepository.deleteDogsById(1L).size());
    }
}
