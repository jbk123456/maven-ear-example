package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH18 {

    @EJB
    private HelperBeanG18 helperBeanG18;

    public String identify() {
        return "HelperBeanH18";
    }
}
