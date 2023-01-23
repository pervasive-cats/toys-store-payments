/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.payment.entities

import java.time.LocalDateTime

import io.github.pervasivecats.payments.purchase.entities.Purchase

import payments.payment.valueobjects.PaymentId

trait Payment {

  val paymentId: PaymentId

  val purchase: Purchase

  val timestamp: LocalDateTime
}
