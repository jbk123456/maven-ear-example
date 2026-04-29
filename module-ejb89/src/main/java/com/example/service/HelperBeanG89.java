package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG89 {

    @EJB
    private HelperBeanF89 helperBeanF89;

    public String identify() {
        return "HelperBeanG89";
    }
}
