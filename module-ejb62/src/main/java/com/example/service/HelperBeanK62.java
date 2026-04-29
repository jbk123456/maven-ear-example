package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK62 {

    @EJB
    private HelperBeanJ62 helperBeanJ62;

    public String identify() {
        return "HelperBeanK62";
    }
}
