package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Section extends JpaRepository<Section, Long> {

}
