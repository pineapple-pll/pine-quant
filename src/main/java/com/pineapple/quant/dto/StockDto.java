package com.pineapple.quant.dto;

import com.pineapple.quant.domain.Stock;
import lombok.Data;

import java.util.Date;

@Data
public class StockDto {
    private String codeName;
    private Date date;
    public StockDto(Stock stock) {
        this.codeName=stock.getCodeName();
        this.date=stock.getDate();
    }
}
