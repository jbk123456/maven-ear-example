package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK84 {

    @EJB
    private HelperBeanJ84 helperBeanJ84;

    public String identify() {
        return "HelperBeanK84";
    }
}
