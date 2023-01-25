/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.payment.entities

trait StartedPaymentOps[A <: StartedPayment] {

  def payWithSuccess(): SuccessfulPayment

  def payWithFailure(): FailedPayment
}
