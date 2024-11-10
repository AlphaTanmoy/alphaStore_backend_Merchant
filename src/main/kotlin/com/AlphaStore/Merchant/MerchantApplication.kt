package com.alphaStore.Merchant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class MerchantApplication

fun main(args: Array<String>) {
	runApplication<MerchantApplication>(*args)
}
