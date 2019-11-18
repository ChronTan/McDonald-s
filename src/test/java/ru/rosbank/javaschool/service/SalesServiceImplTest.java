package ru.rosbank.javaschool.service;


import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesServiceImplTest {

    @Test
    void sale(){
        String name="Burgers";
        int count=4;
        SalesServiceImpl salesService=new SalesServiceImpl();
        for (Map.Entry<String, Integer> entry : salesService.countS.entrySet()) {
            if(name.equals(entry.getKey())){
                entry.setValue(entry.getValue()+count);
                assertEquals(7,entry.setValue(entry.getValue()));
            }
        }
    }


}
