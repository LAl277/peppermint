package com.pfefferminzia.service;

import com.pfefferminzia.Entity.KundenEntity;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pfefferminz")
public class Pfefferminzcontroller {

    @Resource
    PfefferminziaService pfefferminziaService;
    @GetMapping("/getKunden")
    public ResponseEntity<List<KundenEntity>> getKunden() {
        List<KundenEntity> kundenEntityList = pfefferminziaService.getAll();
        return ResponseEntity.ok().body(kundenEntityList);
    }
}
