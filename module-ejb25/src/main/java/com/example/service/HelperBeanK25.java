package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK25 {

    @EJB
    private HelperBeanJ25 helperBeanJ25;

    public String identify() {
        return "HelperBeanK25";
    }
}
