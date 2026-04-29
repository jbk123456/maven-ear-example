package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG107 {

    @EJB
    private HelperBeanF107 helperBeanF107;

    public String identify() {
        return "HelperBeanG107";
    }
}
