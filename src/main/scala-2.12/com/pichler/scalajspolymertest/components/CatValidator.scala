package com.pichler.scalajspolymertest.components

import com.pichler.scalajspolymertest.polymer.{PolymerElement, _}

import scala.scalajs.js
import scala.scalajs.js.{Array, Dynamic, Object}
import scala.scalajs.js.Dynamic.{literal => lit}
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

/**
  * Created by Patrick on 21.11.2016.
  */
@ScalaJSDefined
@JSExport
class CatValidator() extends PolymerElement("cat-validator") with traits.IronValidatorBehavior[String] {

  override def properties: Dynamic = lit(
  )

  override def behaviors = js.Array(
    behavior.IronValidatorBehavior
  )

  override def validate(values: String): Boolean = {
    println(values)
    false
  }
}
