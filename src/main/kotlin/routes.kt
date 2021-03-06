package dev.alpas.alpasdev

import dev.alpas.alpasdev.controllers.DocsController
import dev.alpas.alpasdev.controllers.WelcomeController
import dev.alpas.routing.Router

fun Router.addRoutes() = apply {
    webRoutes()
}

private fun Router.webRoutes() {
    get("/", WelcomeController::class).name("welcome")
    get("/docs/<page>", DocsController::class, "show").name("docs.show")
    get("/docs", DocsController::class, "index").name("docs.index")
}
