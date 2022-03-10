package com.example.Restwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

//    @GetMapping("/staticfiltering")
//    public UserBean retrieveUserBean(){
//        return  new UserBean("HONEY",101,"v3");
//    }
    //id,name
    @GetMapping("/dynamicfiltering")
    public MappingJacksonValue retrieveUserBeandynamic(){
        UserBean userBean=new UserBean("GARIMA",22,"123");
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id","name");
        FilterProvider filters=new SimpleFilterProvider().addFilter("UserBeanfilter",filter);
        MappingJacksonValue mapping=new MappingJacksonValue(userBean);
        mapping.setFilters(filters);
        return  mapping;
    }

    @GetMapping("/dynamicfilteringlist")
    public MappingJacksonValue retrieveListOfUserBeans(){
        List<UserBean> list=Arrays.asList(new UserBean("RADHA",102,"v3"),new UserBean("RAM",103,"v24"));
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id","name");
        FilterProvider filters=new SimpleFilterProvider().addFilter("UserBeanfilter",filter);
        MappingJacksonValue mapping=new MappingJacksonValue(list);
        mapping.setFilters(filters);
        return  mapping;
    }


//    @GetMapping("/filtering-list")
//    public List<UserBean> retrieveListOfSomeBeans(){
//        return Arrays.asList(new UserBean("RADHA",102,"v3"),new UserBean("RAM",103,"v24"));
//    }

}
