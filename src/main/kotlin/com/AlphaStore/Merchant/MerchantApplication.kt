package com.AlphaStore.Merchant

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class MerchantApplication

fun main(args: Array<String>) {
    SpringApplication.run(MerchantApplication::class.java, *args)
}
