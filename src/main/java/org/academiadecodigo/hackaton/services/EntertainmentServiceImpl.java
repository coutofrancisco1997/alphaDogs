package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.EntertainmentDao;
import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EntertainmentServiceImpl implements EntertainmentService {

    private EntertainmentDao entertainmentDao;
    private Map<Integer, Entertainment> entertainmentMap = new HashMap<>();

    @Autowired
    public void setEntertainmentDao(EntertainmentDao entertainmentDao) {
        this.entertainmentDao = entertainmentDao;
    }

    @Override
    public Entertainment get(Integer id) {
        return entertainmentDao.findById(id);
    }

    @Transactional
    @Override
    public Entertainment save(Entertainment business) {
        return entertainmentDao.saveOrUpdate(business);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        entertainmentDao.delete(id);
    }

    @Override
    public List<Entertainment> list() {
        return entertainmentDao.findAll();
    }

    @Override
    public List<Entertainment> listByType(String businessType){
        return entertainmentDao.findAllByType(businessType);
    }
}
