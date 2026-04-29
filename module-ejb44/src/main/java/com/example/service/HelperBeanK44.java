package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK44 {

    @EJB
    private HelperBeanJ44 helperBeanJ44;

    public String identify() {
        return "HelperBeanK44";
    }
}
