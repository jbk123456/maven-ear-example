package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG72 {

    @EJB
    private HelperBeanF72 helperBeanF72;

    public String identify() {
        return "HelperBeanG72";
    }
}
