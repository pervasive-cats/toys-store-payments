package io.github.pervasivecats
package payments.customer.entities

import payments.customer.valueobjects.Email

import payments.customer.valueobjects.card.PaymentCard

trait Customer {

  val email: Email

  val paymentCard: PaymentCard

  def updated(email: Email, paymentCard: PaymentCard): Customer
}
