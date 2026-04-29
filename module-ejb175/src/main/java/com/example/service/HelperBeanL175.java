package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL175 {

    @EJB
    private HelperBeanK175 helperBeanK175;

    public String identify() {
        return "HelperBeanL175";
    }
}
