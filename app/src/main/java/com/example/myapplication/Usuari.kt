package com.example.myapplication

class Usuari (val usuari:String, val clau:String, var rol:Rol, val equip: Array<Usuari>?=null) {
    // enums
    enum class Rol {
        PENDENT,
        ACTIU,
        ADMINISTRADOR,
        BLOQUEJAT
    }

    // Metoda personalizat
    fun presentarse(){
        println("Soc un usuari amb les credencials ${usuari} ${clau}, amb un rol de ${rol}")
    }
}