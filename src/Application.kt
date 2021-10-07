package com.untitled

import com.apurebase.kgraphql.GraphQL
import com.apurebase.kgraphql.schema.dsl.operations.MutationDSL
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.auth.Authentication
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(Authentication) {
    }

    install(ContentNegotiation) {
        gson {
        }
    }

    install(GraphQL) {
        playground = true
        schema {}
    }
}

