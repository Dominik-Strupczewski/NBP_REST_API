package com.example.xCodeRestApi.Exception;

import com.example.xCodeRestApi.Model.CurrenciesCodeJsonModel;

import java.io.IOException;
import java.util.List;

public class CurrencyNotFoundException extends IOException {
    public CurrencyNotFoundException(List<CurrenciesCodeJsonModel> code) {
        super("Currency not specified");
    }
}
