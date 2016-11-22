package com.pichler.scalajspolymertest.components

import com.pichler.scalajspolymertest.polymer._

import scala.scalajs._
import scala.scalajs.js.Array
import scala.scalajs.js.Dynamic.{literal => lit}
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}


/**
  * Created by Patrick on 19.11.2016.
  */
@ScalaJSDefined
@JSExport
class ScalaJSTestComponent extends PolymerElement("scalajs-test") {
  var test: Int = 1

  override def properties = lit(
    "test" -> lit(
      "type" -> types.Number,
      "value" -> 10
    ),

    "testObject" -> lit(
      "type" -> types.Object,
      "value" -> {
        () => lit(
          "name" -> "Sepp Forcher"
        )
      }
    )
  )

  override def observers = js.Array(
    "valueObserver(test)"
  )

  def valueObserver(test: Int): Unit = {
    println(test)
  }

  def buttonClick() = {
    this.test += 10
  }
}
