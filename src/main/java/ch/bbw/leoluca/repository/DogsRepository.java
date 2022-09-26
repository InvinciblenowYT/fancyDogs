package ch.bbw.leoluca.repository;

import ch.bbw.leoluca.model.Dogs;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface DogsRepository extends JpaRepository<Dogs, Integer> {

    //Select with 2 wheres
    @Query("SELECT d FROM dogs d WHERE d.hundefarbe = :colour and d.owners.stadtkreis = :district")
    List<Dogs>dogsByColourAndDistrict(@Param("colour") String colour, @Param("district") Integer district);

    // Select with Paging (spring paging)
    List<Dogs> findAllByHundefarbe(String farbe, Pageable pageable);

    // Delete with where
    @Transactional
    List<Dogs> deleteDogsById(Long id);

    //Join
    @Query("SELECT d FROM dogs d JOIN d.owners o WHERE d.geschlecht_hund = o.geschlecht")
    List<Dogs> findDogsWithSameSexLikeOwner();



    //TODO complicated select

//    @Query("SELECT d FROM dogs d WHERE d.geburtsjahr_hund = :year")
    List<Dogs> findDogsByGeburtsjahrHund(Integer year);

    @Query("SELECT d FROM dogs d WHERE d.geschlecht_hund = :sex")
    List<Dogs> dogsBySex(@Param("sex") String sex);

    @Query("SELECT d FROM dogs d WHERE d.owners.geschlecht = :gender")
    List<Dogs> dogsByOwnerGender(@Param("gender") String gender);

    @Query("SELECT d FROM dogs d WHERE d.geburtsjahr_hund <= :year")
    List<Dogs> dogsBornBefore(@Param("year") Integer year);
}

