package com.parkauto.rest.service;

import com.parkauto.rest.entity.LigneCmd;
import com.parkauto.rest.repository.ILigneCmdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCmdService {
    ILigneCmdRepository ligneCmdRepository;

    public List<LigneCmd> getAllLigneCmds() {
        return ligneCmdRepository.findAll();
    }

    public LigneCmd saveLigneCmd(LigneCmd ligneCmd) {
        return ligneCmdRepository.save(ligneCmd);
    }

    public LigneCmd getLigneCmdById(Long idLigneCmd) {
        return ligneCmdRepository.findById(idLigneCmd).orElseThrow(() -> new RuntimeException("LigneCmd not found"));
    }

    public void  deleteLigneCmd(LigneCmd ligneCmd) {
        ligneCmdRepository.delete(ligneCmd);
    }
}
