package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK81 {

    @EJB
    private HelperBeanJ81 helperBeanJ81;

    public String identify() {
        return "HelperBeanK81";
    }
}
