package com.jiet;

import com.juet.Pack1;

public class Pack2 extends Pack1 {  
    public static void main(String[] args) {
        Pack2 pack2 = new Pack2();  // Creating an object of Pack2
        pack2.display();  // Now accessible because Pack2 inherits Pack1
    }
}