package com.pichler.scalajspolymertest

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs._
import scala.scalajs.js.Dynamic.{literal => lit}
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
  abstract class PolymerElement(_is: String) extends PolymerBase with PolymerLifeCycle with PolymerAttrObserver {
    def is: String = _is

    def properties: js.Dynamic = lit()

    def observers: js.Array[String] = js.Array()

    def behaviors: js.Array[js.Object] = js.Array()

    override def beforeRegister(): Unit = {}

    override def created(): Unit = {}

    override def ready(): Unit = {}

    override def attached(): Unit = {}

    override def detached(): Unit = {}

    override def attributeChanged(aName: String, aType: String): Unit = {}
  }


  @js.native
  @JSName("Polymer.Base")
  abstract class PolymerBase extends HTMLElement {
    @js.native
    val `$`: js.Dynamic = js.native

    @js.native
    val `$$`: js.Dynamic = js.native
  }

  @ScalaJSDefined
  trait PolymerAttrObserver extends js.Object {
    def attributeChanged(aName: String, aType: String): Unit
  }

  @ScalaJSDefined
  trait PolymerLifeCycle extends js.Object {
    def beforeRegister(): Unit

    def created(): Unit

    def ready(): Unit

    def attached(): Unit

    def detached(): Unit
  }

}
