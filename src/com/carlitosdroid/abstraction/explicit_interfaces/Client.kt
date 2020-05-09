package com.carlitosdroid.abstraction.explicit_interfaces

import com.carlitosdroid.abstraction.explicit_interfaces.shop.Shop

class Client(private val shop: Shop) {
    fun buy() {
        shop.sale()
    }
}