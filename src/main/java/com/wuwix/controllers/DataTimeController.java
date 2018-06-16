package com.wuwix.controllers;

import com.wuwix.domain.DataTime;
import com.wuwix.dao.DataTimeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RequestMapping("datatime")
@RestController
public class DataTimeController {

    @GetMapping("/save")
    public DataTime saveUserController() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        DataTime dataTime = new DataTime("obiekt w czasie", localDateTime, localDate, localTime);
        dataTimeDao.persist(dataTime);
        return dataTime;
    }

    @Autowired
    private DataTimeDao dataTimeDao;

}
