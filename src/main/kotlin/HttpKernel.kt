package dev.alpas.alpasdev

import dev.alpas.Application
import dev.alpas.ServiceProvider
import dev.alpas.alpasdev.providers.DocumentationServiceProvider
import dev.alpas.alpasdev.providers.JedisServiceProvider
import dev.alpas.alpasdev.providers.RouteServiceProvider
import dev.alpas.alpasdev.providers.ViewServiceProvider
import dev.alpas.encryption.EncryptionServiceProvider
import dev.alpas.hashing.HashServiceProvider
import dev.alpas.http.HttpKernel
import dev.alpas.logging.LoggerServiceProvider
import dev.alpas.session.SessionServiceProvider
import kotlin.reflect.KClass

@Suppress("unused")
class HttpKernel : HttpKernel() {
    override fun serviceProviders(app: Application): Iterable<KClass<out ServiceProvider>> {
        return listOf(
            LoggerServiceProvider::class,
            RouteServiceProvider::class,
            ViewServiceProvider::class,
            EncryptionServiceProvider::class,
            HashServiceProvider::class,
            SessionServiceProvider::class,
            JedisServiceProvider::class,
            DocumentationServiceProvider::class
        )
    }
}
