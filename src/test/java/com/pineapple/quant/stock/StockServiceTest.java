package com.pineapple.quant.stock;

import com.pineapple.quant.repository.StockRepository;
import org.junit.jupiter.api.Test;

public class StockServiceTest {

    @Test
    void findStockData() {
        final StockRepository stockRepository;

        String stockName = "bgf";
//        List<Stock> stockData = stockRepository.findAll(stockName);
//        List<StockDto> result = stockData.stream()
//                .map(m -> new StockDto(m))
//                .collect(Collectors.toList());
//        System.out.println(result);
    }

}
