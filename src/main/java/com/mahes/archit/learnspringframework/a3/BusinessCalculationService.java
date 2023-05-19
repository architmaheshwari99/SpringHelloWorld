package com.mahes.archit.learnspringframework.a3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService {

    private DataService datasvc;

    public BusinessCalculationService(DataService datasvc) {
        this.datasvc = datasvc;
    }

    public int findMax(){
        return Arrays.stream(datasvc.retrieveData()).max().orElse(0);
    }

}
