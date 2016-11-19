package com.pichler.scalajspolymertest

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

/**
  * Created by Patrick on 19.11.2016.
  */
package object polymer {

  @js.native
  object Polymer extends js.Object {
    def apply(prototype: Dynamic): js.Dynamic = js.native
  }

  @ScalaJSDefined
  abstract class PolymerElement extends PolymerBase {
    def is: String

    def properties: js.Dynamic
  }

  @js.native
  @JSName("Polymer.Base")
  abstract class PolymerBase extends HTMLElement

  @js.native
  object Number extends js.Object {
  }

}
