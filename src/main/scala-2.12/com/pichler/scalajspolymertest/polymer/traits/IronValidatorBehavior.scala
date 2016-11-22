package com.pichler.scalajspolymertest.polymer.traits

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => lit}
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait IronValidatorBehavior[T] extends js.Object {
  def validate(values: T): Boolean
}
