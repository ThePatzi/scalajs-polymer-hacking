package com.pichler.scalajspolymertest

import scala.scalajs.js.{Dictionary, JSApp}
import scala.scalajs._
import scala.scalajs.js.annotation.{JSExport, JSGlobalScope, JSName}

import scala.scalajs.js.Dynamic.{literal => lit}

import polymer._

/**
  * Created by Patrick on 17.11.2016.
  */
object Main extends JSApp {
  @JSExport
  override def main(): Unit = {
    println("whololo")
  }
}

@JSExport
class ScalaJSTestComponent {
  @JSName("test")
  var test: Int = 1

  @JSExport
  var is: String = "scalajs-test"

  @JSExport
  def properties = lit(
    "test" -> lit(
      "value" -> 10,
      "type" -> Number
    )
  )

  @JSExport
  def buttonClick() = {
    js.Dynamic.global.console.log(js.Dynamic.global.test)
  }
}
