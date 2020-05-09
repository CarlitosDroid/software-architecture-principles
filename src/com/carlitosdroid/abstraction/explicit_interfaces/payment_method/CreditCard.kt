package com.carlitosdroid.abstraction.explicit_interfaces.payment_method

class CreditCard : PaymentMethod {

    override fun processPayment() {
        print("Process payment with CreditCard...")
    }

}