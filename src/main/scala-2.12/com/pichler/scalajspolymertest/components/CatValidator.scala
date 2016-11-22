package com.pichler.scalajspolymertest.components

import com.pichler.scalajspolymertest.polymer.{PolymerElement, _}

import scala.scalajs.js
import scala.scalajs.js.{Array, Dynamic, JSApp, Object}
import scala.scalajs.js.Dynamic.{literal => lit}
import scala.scalajs.js.annotation.{JSExport, JSName, ScalaJSDefined}

/**
  * Created by Patrick on 21.11.2016.
  */
@ScalaJSDefined
@JSExport
class CatValidator extends PolymerElement("cat-validator") with traits.IronValidatorBehavior[Any] {

  override def properties: Dynamic = lit(
  )

  override def behaviors = js.Array(
    behavior.IronValidatorBehavior
  )

  override def validate(values: Any): Boolean = {
    val Pattern = "^([A-Za-z]*)(\\d*)([A-Za-z]*)$".r

    values match {
      case y: String => y match {
        case Pattern(f, s, t) => println(f + " => " + s + " => " + t)
        case _ =>
      }

      case _ =>
    }

    false
  }
}

@ScalaJSDefined
@JSExport
object CatValidatorBootstrap extends js.Object {
  def init(): Unit = {
    Polymer(js.constructorOf[CatValidator])
  }
}
