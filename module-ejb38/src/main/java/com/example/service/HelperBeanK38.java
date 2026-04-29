package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK38 {

    @EJB
    private HelperBeanJ38 helperBeanJ38;

    public String identify() {
        return "HelperBeanK38";
    }
}
