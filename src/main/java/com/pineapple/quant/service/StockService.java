package com.pineapple.quant.service;

import com.pineapple.quant.domain.Stock;
import com.pineapple.quant.dto.StockDto;
import com.pineapple.quant.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StockService {
    private final StockRepository stockRepository;

    public List<StockDto> findStockData(String stockName) {
        List<Stock> stockData = stockRepository.findAll(stockName);
        List<StockDto> result = stockData.stream()
                .map(m -> new StockDto(m))
                .collect(Collectors.toList());
        return result;
    }
}
