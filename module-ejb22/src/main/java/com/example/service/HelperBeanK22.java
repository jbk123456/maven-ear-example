package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK22 {

    @EJB
    private HelperBeanJ22 helperBeanJ22;

    public String identify() {
        return "HelperBeanK22";
    }
}
