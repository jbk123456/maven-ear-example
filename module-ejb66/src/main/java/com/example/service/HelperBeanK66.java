package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK66 {

    @EJB
    private HelperBeanJ66 helperBeanJ66;

    public String identify() {
        return "HelperBeanK66";
    }
}
