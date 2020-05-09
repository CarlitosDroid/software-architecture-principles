package com.carlitosdroid.abstraction.explicit_interfaces.shop

import com.carlitosdroid.abstraction.explicit_interfaces.payment_method.PaymentMethod

class Restaurant(private val paymentMethod: PaymentMethod) : Shop {

    override fun sale() {
        println("Selling food...")
        paymentMethod.processPayment()
    }

}