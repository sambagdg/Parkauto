package com.parkauto.rest.controller;

import com.parkauto.rest.entity.LigneCmd;
import com.parkauto.rest.service.LigneCmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class LigneCmdController {
    @Autowired
    LigneCmdService ligneCmdService;

    @PostMapping("/ligneCmd")
    public LigneCmd LigneCmd(@Validated @RequestBody(required = false) LigneCmd ligneCmd) {
        return ligneCmdService.saveLigneCmd(ligneCmd);
    }

    @GetMapping("/ligneCmd")
    public List<LigneCmd> getAllLigneCmds() {
        return ligneCmdService.getAllLigneCmds();
    }

    @GetMapping("/ligneCmd/{idLigneCmd}")
    public ResponseEntity<?> findLigneCmdById(@PathVariable(name = "idLigneCmd") Long idLigneCmd) {
        if (idLigneCmd == null) {
            return ResponseEntity.badRequest().body("Cannot find ligneCmd with null id");
        }
        LigneCmd ligneCmd = ligneCmdService.getLigneCmdById(idLigneCmd);
        if (ligneCmd == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ligneCmd);

    }
}
