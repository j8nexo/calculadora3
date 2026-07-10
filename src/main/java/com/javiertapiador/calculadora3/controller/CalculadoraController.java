package com.javiertapiador.calculadora3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/sumar")
    public int sumar(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/restar")
    public int restar(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam int a, @RequestParam int b){
        if(b == 0){
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        else{
            return    (double) a / b; }
    }
}