package com.example.xCodeRestApi.Exception;

import com.example.xCodeRestApi.Model.CurrenciesCodeJsonModel;

import java.io.FileNotFoundException;
import java.util.List;

public class CurrencyNotFoundException extends FileNotFoundException {
    public CurrencyNotFoundException(List<CurrenciesCodeJsonModel> code ) {

        super("Bad currency code or value type ={"  + code.get(0).getCurrency()+ "}" );
    }
}
