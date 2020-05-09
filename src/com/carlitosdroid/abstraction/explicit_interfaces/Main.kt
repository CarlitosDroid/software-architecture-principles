package com.carlitosdroid.abstraction.explicit_interfaces

import com.carlitosdroid.abstraction.explicit_interfaces.payment_method.CreditCard
import com.carlitosdroid.abstraction.explicit_interfaces.shop.Barber

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val client = Client(Barber(CreditCard()))
        client.buy()
    }
}