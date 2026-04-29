package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL161 {

    @EJB
    private HelperBeanK161 helperBeanK161;

    public String identify() {
        return "HelperBeanL161";
    }
}
