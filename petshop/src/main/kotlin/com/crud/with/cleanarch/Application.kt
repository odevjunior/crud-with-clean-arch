package com.crud.with.cleanarch

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.crud.with.cleanarch")
		.start()
}

