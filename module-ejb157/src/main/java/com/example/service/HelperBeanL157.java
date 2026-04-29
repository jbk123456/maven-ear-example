package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL157 {

    @EJB
    private HelperBeanK157 helperBeanK157;

    public String identify() {
        return "HelperBeanL157";
    }
}
