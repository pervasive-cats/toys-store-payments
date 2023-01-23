package io.github.pervasivecats
package payments.payment.entities

import payments.payment.valueobjects.PaymentId

import io.github.pervasivecats.payments.purchase.entities.Purchase

import java.time.LocalDateTime

trait Payment {

  val paymentId: PaymentId

  val purchase: Purchase

  val timestamp: LocalDateTime
}
