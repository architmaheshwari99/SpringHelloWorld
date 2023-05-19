package com.mahes.archit.learnspringframework.a7;

import com.mahes.archit.learnspringframework.a3.DataService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Named
class BusinessSvc {
    private DataSvc dataService;

    public DataSvc getDataService() {
        return dataService;
    }

    @Inject
    public void setDataService(DataSvc dataService) {
        this.dataService = dataService;
    }
}

@Named
class DataSvc {}


@Configuration
@ComponentScan
public class CDIContext {



    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(CDIContext.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

        System.out.println(context.getBean(BusinessSvc.class));

    }

}
