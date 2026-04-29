package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH157 {

    @EJB
    private HelperBeanG157 helperBeanG157;

    public String identify() {
        return "HelperBeanH157";
    }
}
