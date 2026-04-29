package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ25 {

    @EJB
    private HelperBeanI25 helperBeanI25;

    public String identify() {
        return "HelperBeanJ25";
    }
}
