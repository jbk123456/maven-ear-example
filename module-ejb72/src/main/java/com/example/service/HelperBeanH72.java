package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH72 {

    @EJB
    private HelperBeanG72 helperBeanG72;

    public String identify() {
        return "HelperBeanH72";
    }
}
