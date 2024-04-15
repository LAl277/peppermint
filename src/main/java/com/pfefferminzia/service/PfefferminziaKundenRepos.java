package com.pfefferminzia.service;

import com.pfefferminzia.Entity.KundenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PfefferminziaKundenRepos extends JpaRepository<KundenEntity, Long> {

    List<KundenEntity> findAll();

    @Query("SELECT vv.kunde FROM VersicherungsvertraegeEntity vv WHERE vv.versicherung.versicherungsID = :versicherungsId")
    List<KundenEntity> findKundenByVersicherungsId(@Param("versicherungsId") long versicherungsId);
}
