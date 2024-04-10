package com.pfefferminzia.service;

import com.pfefferminzia.Entity.KundenEntity;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PfefferminziaService {
    @Resource
    PfefferminziaRepos pfefferminziaRepos;
    public List<KundenEntity> getAll() {

        return pfefferminziaRepos.findAll();
    }
}
