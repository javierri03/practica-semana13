package com.javier;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", "García", 25, "juan@email.com");
        Gson gson = new Gson();
        String json = gson.toJson(p);

        System.out.println("Objeto es formato JSON: " + json);
    }
}