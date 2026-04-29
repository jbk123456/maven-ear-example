package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ26 {

    @EJB
    private HelperBeanI26 helperBeanI26;

    public String identify() {
        return "HelperBeanJ26";
    }
}
