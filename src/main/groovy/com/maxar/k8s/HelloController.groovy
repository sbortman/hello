package com.maxar.k8s

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller( "/" )
class HelloController {

  @Get( uri = "/", produces = "text/plain" )
  String index() {
    "${ new Date() } ${ InetAddress.localHost }"
  }
}