package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK16 {

    @EJB
    private HelperBeanJ16 helperBeanJ16;

    public String identify() {
        return "HelperBeanK16";
    }
}
