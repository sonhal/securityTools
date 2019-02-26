package com.rsk

import java.security.Provider
import java.security.Security


data class ProviderDetails(val providerName: String, val name: String)

class Providers {

    fun getProviders(): List<Provider> {
        val providers = Security.getProviders()
        val listOfProviders: List<Provider> = providers.asList()
        return listOfProviders
    }

    fun getAllProviders(): List<ProviderDetails> {
        val providers = Security.getProviders()
        val listOfProviders = mutableListOf<ProviderDetails>()

        providers.forEach {
            provider ->
                val providerDetails = provider.entries.map {entry -> ProviderDetails(provider.name, entry.key.toString())}
            listOfProviders += providerDetails
        }
        return listOfProviders
    }

    companion object {
        fun getProviders(): List<Provider> {
            val providers = Security.getProviders()
            val listOfProviders: List<Provider> = providers.asList()
            return listOfProviders
        }
    }
}