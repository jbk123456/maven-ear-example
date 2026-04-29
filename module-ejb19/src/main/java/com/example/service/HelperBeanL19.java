package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL19 {

    @EJB
    private HelperBeanK19 helperBeanK19;

    public String identify() {
        return "HelperBeanL19";
    }
}
