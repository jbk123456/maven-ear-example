package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ78 {

    @EJB
    private HelperBeanI78 helperBeanI78;

    public String identify() {
        return "HelperBeanJ78";
    }
}
