package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK169 {

    @EJB
    private HelperBeanJ169 helperBeanJ169;

    public String identify() {
        return "HelperBeanK169";
    }
}
