package ch.bbw.leoluca.repository;

import ch.bbw.leoluca.model.Dogs;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface DogsRepository extends JpaRepository<Dogs, Integer> {

    // Select with 2 wheres

    @Query();

    // Select with Limit (spring paging)

    @Query(value = "SELECT d FROM dogs d limit ?1, ?2", nativeQuery = true)
    List<Dogs> findDogs(int offset, int limit);

    // Page<Dogs> allDogs =
    // Delete with where

    // Join

    // complicated select

    @Query("SELECT d FROM dogs d WHERE d.geburtsjahr_hund = :year")
    List<Dogs>dogsByYear(@Param("year") Integer year);

    @Query("SELECT d FROM dogs d WHERE d.geschlecht_hund = :sex")
    List<Dogs> dogsBySex(@Param("sex") String sex);

    @Query("SELECT d FROM dogs d WHERE d.owners.geschlecht = :gender")
    List<Dogs> dogsByOwnerGender(@Param("gender") String gender);

    @Query("SELECT d FROM dogs d WHERE d.geburtsjahr_hund <= :year")
    List<Dogs> dogsBornBefore(@Param("year") Integer year);
}

