package com.pineapple.quant.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Date;

@Entity
@Data
public class Stock {
    @Column(name = "code_name")
    private String codeName;
    private Date date;


}
