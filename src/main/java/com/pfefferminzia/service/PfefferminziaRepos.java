package com.pfefferminzia.service;

import com.pfefferminzia.Entity.KundenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PfefferminziaRepos extends JpaRepository<KundenEntity, Long> {
}
