package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK118 {

    @EJB
    private HelperBeanJ118 helperBeanJ118;

    public String identify() {
        return "HelperBeanK118";
    }
}
