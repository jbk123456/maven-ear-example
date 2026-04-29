package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL128 {

    @EJB
    private HelperBeanK128 helperBeanK128;

    public String identify() {
        return "HelperBeanL128";
    }
}
