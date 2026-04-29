package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK13 {

    @EJB
    private HelperBeanJ13 helperBeanJ13;

    public String identify() {
        return "HelperBeanK13";
    }
}
