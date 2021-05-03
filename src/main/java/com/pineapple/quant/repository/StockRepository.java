package com.pineapple.quant.repository;

import com.pineapple.quant.domain.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StockRepository {

    private final EntityManager em;


    public List<Stock> findAll(String stockName){
        String jpql = "SELECT b FROM :stockName b";
        Query query = em.createQuery(jpql);
        query.setParameter("stockName", stockName);
        return query.getResultList();
    }
}
