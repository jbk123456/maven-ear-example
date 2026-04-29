package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ38 {

    @EJB
    private HelperBeanI38 helperBeanI38;

    public String identify() {
        return "HelperBeanJ38";
    }
}
