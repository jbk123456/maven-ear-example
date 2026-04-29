package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK165 {

    @EJB
    private HelperBeanJ165 helperBeanJ165;

    public String identify() {
        return "HelperBeanK165";
    }
}
