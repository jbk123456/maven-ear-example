package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK59 {

    @EJB
    private HelperBeanJ59 helperBeanJ59;

    public String identify() {
        return "HelperBeanK59";
    }
}
