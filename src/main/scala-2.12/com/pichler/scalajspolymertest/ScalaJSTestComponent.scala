package com.pichler.scalajspolymertest

import com.pichler.scalajspolymertest.polymer._

import scala.scalajs.js.{Dictionary, JSApp}
import scala.scalajs._
import scala.scalajs.js.annotation.{JSExport, JSGlobalScope, JSName, ScalaJSDefined}
import scala.scalajs.js.Dynamic.{literal => lit}


/**
  * Created by Patrick on 19.11.2016.
  */
@ScalaJSDefined
@JSExport
class ScalaJSTestComponent extends PolymerElement {
  var test: Int = 1

  override def is: String = "scalajs-test"

  override def properties = lit(
    "test" -> lit(
      "value" -> 10,
      "type" -> Number
    )
  )

  def buttonClick() = {
    this.test += 10
    js.Dynamic.global.console.log(this.test)
  }
}
