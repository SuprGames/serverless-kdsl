package io.suprgames.serverless

annotation class HttpFunction(val name: String = "", val method: HttpMethod = HttpMethod.GET, val path: String)