
package com.bancomaya.clientes;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bancomaya.clientes.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String nombre) {
        return "Hola " + nombre + " Bienvenido a Codigo Rupestre Space Native!!";
    }
}

