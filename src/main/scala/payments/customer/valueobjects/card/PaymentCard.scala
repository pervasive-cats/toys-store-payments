package io.github.pervasivecats
package payments.customer.valueobjects.card

trait PaymentCard {
  
  val cardNumber: CardNumber
  
  val cardSecurityCode: CardSecurityCode
  
  val cardHolder: CardHolder
}
