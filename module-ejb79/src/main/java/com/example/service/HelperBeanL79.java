package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL79 {

    @EJB
    private HelperBeanK79 helperBeanK79;

    public String identify() {
        return "HelperBeanL79";
    }
}
