package com.carlitosdroid.abstraction.explicit_interfaces.shop

import com.carlitosdroid.abstraction.explicit_interfaces.payment_method.PaymentMethod

class Barber(private val paymentMethod: PaymentMethod) : Shop {

    override fun sale() {
        println("Selling styling cream...")
        paymentMethod.processPayment()
    }

}