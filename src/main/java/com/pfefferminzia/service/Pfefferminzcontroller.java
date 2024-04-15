package com.pfefferminzia.service;

import com.pfefferminzia.Entity.KundenEntity;
import com.pfefferminzia.Entity.VersicherungsvertraegeEntity;
import jakarta.annotation.Resource;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/pfefferminz")
public class Pfefferminzcontroller {

    @Autowired
    PfefferminziaService pfefferminziaService;
    @GetMapping("/getKunden")
    public List<KundenEntity> getKunden() {
        List<KundenEntity> kundenEntityList = pfefferminziaService.getAllKunden();
        return kundenEntityList;
    }

    @GetMapping("/getKundenMitVersicherung/{versicherungsId}")
    public List<KundenEntity> getKundenMitVersicherung(@PathVariable long versicherungsId) {
        return pfefferminziaService.findeKundenMitVersicherung(versicherungsId);
    }

}
