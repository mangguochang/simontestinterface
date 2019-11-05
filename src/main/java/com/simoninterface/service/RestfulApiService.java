package com.simoninterface.service;

import com.simoninterface.interfaces.api.RestfulApiDelegate;
import com.simoninterface.interfaces.dto.Person;
import com.simoninterface.interfaces.dto.RestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simonMeng
 * @version 1.0
 * @date 2019/10/14
 **/
@Component
public class RestfulApiService implements RestfulApiDelegate {
    @Override
    public ResponseEntity<RestResponse> getRestful() {
        System.out.println("postRestful-----");
        return null;
    }

    @Override
    public ResponseEntity<List<Person>> postRestful(Person body) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setId(i + 1);
            person.setAge(20 + i);
            person.setName("simonMeng" + i);
            person.setSex("男");
            people.add(person);
        }
        System.out.println("postRestful-----");
        return ResponseEntity.ok(people);
    }
}
