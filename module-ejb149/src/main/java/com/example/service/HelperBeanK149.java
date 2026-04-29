package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK149 {

    @EJB
    private HelperBeanJ149 helperBeanJ149;

    public String identify() {
        return "HelperBeanK149";
    }
}
