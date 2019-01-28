package com.apujadas.jacocokotlin

class CustomerBuilder {

    var id: Long? = null
        private set
    var name: String? = null
        private set

    fun id(id: Long) = apply { this.id = id }
    fun name(name: String) = apply { this.name = name }

}
