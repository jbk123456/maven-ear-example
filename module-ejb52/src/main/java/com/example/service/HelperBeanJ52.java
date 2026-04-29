package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ52 {

    @EJB
    private HelperBeanI52 helperBeanI52;

    public String identify() {
        return "HelperBeanJ52";
    }
}
