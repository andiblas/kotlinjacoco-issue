package com.apujadas.jacocokotlin

class CustomerBuilder {

    var id: Long? = null
    var name: String? = null

    fun id(id: Long) = apply { this.id = id }
    fun name(name: String) = apply { this.name = name }

}
