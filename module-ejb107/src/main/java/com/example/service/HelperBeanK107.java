package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK107 {

    @EJB
    private HelperBeanJ107 helperBeanJ107;

    public String identify() {
        return "HelperBeanK107";
    }
}
