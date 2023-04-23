/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.payment

import java.time.LocalDateTime

import payments.customer.valueobjects.Email
import payments.payment.entities.Payment
import payments.payment.valueobjects.PaymentId
import payments.purchase.entities.Purchase

trait Repository {

  def findById(id: PaymentId): Payment

  def findByCustomer(email: Email): List[Payment]

  def findByDateRange(startDate: LocalDateTime, endDate: LocalDateTime): List[Payment]

  def add(purchase: Purchase): Unit

  def remove(purchase: Purchase): Unit
}
