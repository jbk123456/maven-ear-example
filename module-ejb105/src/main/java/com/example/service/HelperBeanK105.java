package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK105 {

    @EJB
    private HelperBeanJ105 helperBeanJ105;

    public String identify() {
        return "HelperBeanK105";
    }
}
