package com.carlitosdroid.abstraction.explicit_interfaces.payment_method

class Visa : PaymentMethod {
    override fun processPayment() {
        print("Process payment with Visa...")
    }
}