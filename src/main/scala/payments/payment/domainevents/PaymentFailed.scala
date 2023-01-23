package io.github.pervasivecats
package payments.payment.domainevents

import payments.payment.valueobjects.PaymentId

trait PaymentFailed {

  val paymentId: PaymentId
}
