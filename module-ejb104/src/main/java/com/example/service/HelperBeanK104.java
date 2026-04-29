package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK104 {

    @EJB
    private HelperBeanJ104 helperBeanJ104;

    public String identify() {
        return "HelperBeanK104";
    }
}
