package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI38 {

    @EJB
    private HelperBeanH38 helperBeanH38;

    public String identify() {
        return "HelperBeanI38";
    }
}
