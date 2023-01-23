package io.github.pervasivecats
package payments.payment.entities

trait StartedPayment {

  def payWithSuccess(): SuccessfulPayment
  
  def payWithFailure(): FailedPayment
}
