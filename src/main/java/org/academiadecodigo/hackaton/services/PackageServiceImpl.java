package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.Pact;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PackageServiceImpl implements PackageService{

    private Map<Integer, Pact> packageMap = new HashMap<>();

    @Override
    public Pact get(Integer id) {
        return packageMap.get(id);
    }

    @Override
    public List<Pact> list() {
        return new ArrayList<>(packageMap.values());
    }

    @Override
    public void delete(Integer id) {
        packageMap.remove(id);
    }

    @Override
    public void add(Pact pacote) {

        if (pacote.getId() == null) {
            pacote.setId(getNextId());
        }

        packageMap.put(pacote.getId(), pacote);
    }

    private Integer getNextId() {
        return packageMap.isEmpty() ? 1 : Collections.max(packageMap.keySet()) + 1;
    }
}
