package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL34 {

    @EJB
    private HelperBeanK34 helperBeanK34;

    public String identify() {
        return "HelperBeanL34";
    }
}
