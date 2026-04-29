package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK60 {

    @EJB
    private HelperBeanJ60 helperBeanJ60;

    public String identify() {
        return "HelperBeanK60";
    }
}
