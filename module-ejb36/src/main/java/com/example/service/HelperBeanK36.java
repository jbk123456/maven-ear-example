package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK36 {

    @EJB
    private HelperBeanJ36 helperBeanJ36;

    public String identify() {
        return "HelperBeanK36";
    }
}
