package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG167 {

    @EJB
    private HelperBeanF167 helperBeanF167;

    public String identify() {
        return "HelperBeanG167";
    }
}
