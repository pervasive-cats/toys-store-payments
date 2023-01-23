package io.github.pervasivecats
package payments.payment.services

import payments.payment.domainevents.{PaymentFailed, PaymentSucceeded}

trait PaymentTerminationHandlers {

  def onPaymentSucceeded(event: PaymentSucceeded): Unit

  def onPaymentFailed(event: PaymentFailed): Unit
}
