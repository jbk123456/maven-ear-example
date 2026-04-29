package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL24 {

    @EJB
    private HelperBeanK24 helperBeanK24;

    public String identify() {
        return "HelperBeanL24";
    }
}
