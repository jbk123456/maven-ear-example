package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK177 {

    @EJB
    private HelperBeanJ177 helperBeanJ177;

    public String identify() {
        return "HelperBeanK177";
    }
}
