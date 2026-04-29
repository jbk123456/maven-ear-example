package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM161 {

    @EJB
    private HelperBeanL161 helperBeanL161;

    public String identify() {
        return "HelperBeanM161";
    }
}
