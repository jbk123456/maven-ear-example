package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI25 {

    @EJB
    private HelperBeanH25 helperBeanH25;

    public String identify() {
        return "HelperBeanI25";
    }
}
