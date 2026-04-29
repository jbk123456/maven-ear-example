package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL81 {

    @EJB
    private HelperBeanK81 helperBeanK81;

    public String identify() {
        return "HelperBeanL81";
    }
}
