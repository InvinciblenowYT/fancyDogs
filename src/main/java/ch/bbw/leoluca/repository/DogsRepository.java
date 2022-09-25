package ch.bbw.leoluca.repository;

import ch.bbw.leoluca.model.Dogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface DogsRepository extends JpaRepository<Dogs, Integer> {
/*
    List<Dogs> findBygeburtsjahr_hundEquals(Integer year);
*/
    @Query("SELECT d FROM dogs d WHERE d.geburtsjahr_hund = :year")
    List<Dogs>dogsByYear(@Param("year") Integer year);

    @Query("SELECT d FROM dogs d WHERE d.geschlecht_hund = :sex")
    List<Dogs> dogsBySex(@Param("sex") String sex);

    @Query("SELECT d FROM dogs d WHERE d.owners.geschlecht = :gender")
    List<Dogs> dogsByOwnerGender(@Param("gender") String gender);
}

