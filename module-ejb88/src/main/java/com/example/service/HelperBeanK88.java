package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK88 {

    @EJB
    private HelperBeanJ88 helperBeanJ88;

    public String identify() {
        return "HelperBeanK88";
    }
}
