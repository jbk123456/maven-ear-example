package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK131 {

    @EJB
    private HelperBeanJ131 helperBeanJ131;

    public String identify() {
        return "HelperBeanK131";
    }
}
