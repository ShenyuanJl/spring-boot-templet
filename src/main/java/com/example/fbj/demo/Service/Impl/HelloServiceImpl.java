package com.example.fbj.demo.Service.Impl;

import com.example.fbj.demo.Dao.HelloDao;
import com.example.fbj.demo.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService{

    @Autowired
    private HelloDao helloDao;

    @Override
    public List getDataTest() {
        return helloDao.getDataTest();
    }
}
