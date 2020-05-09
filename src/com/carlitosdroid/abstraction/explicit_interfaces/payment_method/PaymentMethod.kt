package com.carlitosdroid.abstraction.explicit_interfaces.payment_method

/**
 * A generic payment method that supports process whatever payment method.
 */
interface PaymentMethod {
    /**
     * Process transaction based through a payment method.
     */
    fun processPayment()
}