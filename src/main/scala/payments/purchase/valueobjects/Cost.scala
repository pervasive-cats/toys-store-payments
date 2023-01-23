package io.github.pervasivecats
package payments.purchase.valueobjects

trait Cost {

  val amount: Amount
  val currency: Currency
}
