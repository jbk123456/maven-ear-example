package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK78 {

    @EJB
    private HelperBeanJ78 helperBeanJ78;

    public String identify() {
        return "HelperBeanK78";
    }
}
