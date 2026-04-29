package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK175 {

    @EJB
    private HelperBeanJ175 helperBeanJ175;

    public String identify() {
        return "HelperBeanK175";
    }
}
