package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH89 {

    @EJB
    private HelperBeanG89 helperBeanG89;

    public String identify() {
        return "HelperBeanH89";
    }
}
