package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK56 {

    @EJB
    private HelperBeanJ56 helperBeanJ56;

    public String identify() {
        return "HelperBeanK56";
    }
}
