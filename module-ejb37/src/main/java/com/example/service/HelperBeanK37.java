package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK37 {

    @EJB
    private HelperBeanJ37 helperBeanJ37;

    public String identify() {
        return "HelperBeanK37";
    }
}
