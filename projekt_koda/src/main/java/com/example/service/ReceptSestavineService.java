package com.example.service;

import com.example.model.ReceptSestavine;
import com.example.repository.ReceptSestavineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Storitev za upravljanje sestavin receptov.
 * Skrbi za pridobivanje, shranjevanje in brisanje podatkov.
 */
@Service
public class ReceptSestavineService {

    private final ReceptSestavineRepository receptSestavineRepository;

    /**
     * Ustvari storitev in ji dodeli repozitorij.
     *
     * @param receptSestavineRepository repozitorij za sestavine receptov
     */
    public ReceptSestavineService(
            ReceptSestavineRepository receptSestavineRepository) {
        this.receptSestavineRepository = receptSestavineRepository;
    }

    /**
     * Vrne vse sestavine receptov.
     *
     * @return seznam vseh zapisov
     */
    public List<ReceptSestavine> findAll() {
        return receptSestavineRepository.findAll();
    }

    /**
     * Poišče sestavino recepta po ID-ju.
     *
     * @param id identifikator zapisa
     * @return Optional z zapisom, če obstaja, sicer prazen Optional
     */
    public Optional<ReceptSestavine> findById(Integer id) {
        return receptSestavineRepository.findById(id);
    }

    /**
     * Shrani sestavino recepta.
     *
     * @param receptSestavine sestavina recepta za shranjevanje
     * @return shranjeni zapis
     */
    public ReceptSestavine save(ReceptSestavine receptSestavine) {
        return receptSestavineRepository.save(receptSestavine);
    }

    /**
     * Izbriše zapis po ID-ju.
     *
     * @param id identifikator zapisa za brisanje
     */
    public void deleteById(Integer id) {
        receptSestavineRepository.deleteById(id);
    }
}
