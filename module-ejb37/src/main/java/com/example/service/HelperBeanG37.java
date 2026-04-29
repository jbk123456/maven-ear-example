package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG37 {

    @EJB
    private HelperBeanF37 helperBeanF37;

    public String identify() {
        return "HelperBeanG37";
    }
}
