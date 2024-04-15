package com.pfefferminzia.service;

import com.pfefferminzia.Entity.KundenEntity;
import com.pfefferminzia.Entity.VersicherungsvertraegeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PfefferminziaService {
    @Autowired
    PfefferminziaKundenRepos pfefferminziaKundenRepos;

    public List<KundenEntity> getAllKunden() {

        return pfefferminziaKundenRepos.findAll();
    }

    public List<KundenEntity> findeKundenMitVersicherung(long  versicherungsId) {
        return pfefferminziaKundenRepos.findKundenByVersicherungsId(versicherungsId);

    }
}
