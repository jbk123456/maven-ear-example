package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL177 {

    @EJB
    private HelperBeanK177 helperBeanK177;

    public String identify() {
        return "HelperBeanL177";
    }
}
