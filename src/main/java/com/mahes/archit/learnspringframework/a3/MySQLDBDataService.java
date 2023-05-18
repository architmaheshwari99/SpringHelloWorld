package com.mahes.archit.learnspringframework.a3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDBDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {22,99,89,101};
    }
}
