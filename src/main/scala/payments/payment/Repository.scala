/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.payment

import java.time.LocalDateTime

import io.github.pervasivecats.payments.customer.valueobjects.Email
import io.github.pervasivecats.payments.payment.valueobjects.PaymentId
import io.github.pervasivecats.payments.purchase.entities.Purchase

import payments.payment.entities.Payment

trait Repository {

  def findById(payment: PaymentId): Payment

  def findByCustomer(email: Email): List[Payment]

  def findByDateRange(startDate: LocalDateTime, endDate: LocalDateTime): List[Purchase]

  def add(payment: Payment): Unit

  def remove(payment: Payment): Unit
}
