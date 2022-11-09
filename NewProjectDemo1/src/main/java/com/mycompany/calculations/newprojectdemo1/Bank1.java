/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculations.newprojectdemo1;

/**
 *
 * @author User
 */
public class Bank1 {
    private String name;
    private int code;

    public Bank1() {
    }

    public Bank1(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Bank1{" + "name=" + name + ", code=" + code + '}';
    }
    
    
    
    
    
    
    
    
    
}
