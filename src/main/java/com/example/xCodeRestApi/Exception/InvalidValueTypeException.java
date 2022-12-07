package com.example.xCodeRestApi.Exception;

import com.example.xCodeRestApi.Model.TableJsonModel;

import javax.management.JMException;
import java.util.List;

public class InvalidValueTypeException extends JMException {
    public InvalidValueTypeException(List<TableJsonModel> table) {
        super("Bad type of value");
    }
}
