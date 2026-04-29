package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK141 {

    @EJB
    private HelperBeanJ141 helperBeanJ141;

    public String identify() {
        return "HelperBeanK141";
    }
}
