package com.roger.web;

import com.roger.dao.PersonDao;
import com.roger.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Roger on 2016/12/7.
 */
@RestController
public class DataController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestBody Person person){
        personDao.save(person);
    }

    @RequestMapping("/get/{id}")
    public Person get(@PathVariable String id){
        return personDao.getPerson(id);
    }
}
