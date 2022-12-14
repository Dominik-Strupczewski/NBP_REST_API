package com.example.xCodeRestApi.Exception;

import com.example.xCodeRestApi.Model.TableJsonModel;

import javax.management.JMException;
import java.util.List;

public class InvalidValueException extends JMException {
    public InvalidValueException(List<TableJsonModel> table ) {

        super("Bad value in " + table.toString());
    }
}
