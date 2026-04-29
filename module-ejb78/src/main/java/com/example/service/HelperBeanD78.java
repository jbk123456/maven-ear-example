package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD78 {

    @EJB
    private HelperBeanC78 helperBeanC78;

    public String identify() {
        return "HelperBeanD78";
    }
}
