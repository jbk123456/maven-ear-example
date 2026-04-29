package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK129 {

    @EJB
    private HelperBeanJ129 helperBeanJ129;

    public String identify() {
        return "HelperBeanK129";
    }
}
