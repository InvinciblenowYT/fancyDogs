package ch.bbw.leoluca.repository;

import ch.bbw.leoluca.model.Dogs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogsRepository extends JpaRepository<Dogs, Integer> {

}

