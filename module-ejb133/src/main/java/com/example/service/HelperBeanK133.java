package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK133 {

    @EJB
    private HelperBeanJ133 helperBeanJ133;

    public String identify() {
        return "HelperBeanK133";
    }
}
