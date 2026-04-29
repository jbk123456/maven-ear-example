package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK21 {

    @EJB
    private HelperBeanJ21 helperBeanJ21;

    public String identify() {
        return "HelperBeanK21";
    }
}
