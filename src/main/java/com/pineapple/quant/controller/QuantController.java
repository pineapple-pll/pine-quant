package com.pineapple.quant.controller;

import com.pineapple.quant.dto.StockDto;
import com.pineapple.quant.response.Response;
import com.pineapple.quant.service.StockService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quant")
public class QuantController {
    private final StockService stockService;

    public QuantController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public String quant()
    {
        return "quant start";
    }

    @GetMapping("/getStockData")
    public ResponseEntity list(@RequestParam String stockName) {
        List<StockDto> stockData = stockService.findStockData(stockName);

        Response response = new Response(stockData.size(), stockData);

        return new ResponseEntity(response, HttpStatus.OK);
    }
}
