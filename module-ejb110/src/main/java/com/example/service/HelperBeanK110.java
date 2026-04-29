package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK110 {

    @EJB
    private HelperBeanJ110 helperBeanJ110;

    public String identify() {
        return "HelperBeanK110";
    }
}
