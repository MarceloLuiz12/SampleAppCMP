package com.marcelo.sampleappkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform