package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK74 {

    @EJB
    private HelperBeanJ74 helperBeanJ74;

    public String identify() {
        return "HelperBeanK74";
    }
}
