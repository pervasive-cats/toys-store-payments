package io.github.pervasivecats
package payments.payment

import payments.payment.entities.Payment

import io.github.pervasivecats.payments.customer.valueobjects.Email
import io.github.pervasivecats.payments.purchase.entities.Purchase

import java.time.LocalDateTime

trait Repository {

  def findById(payment: Payment): Payment

  def findByCustomer(email: Email): List[Payment]

  def findByDateRange(startDate: LocalDateTime, endDate: LocalDateTime): List[Purchase]

  def add(purchase: Purchase): Unit

  def remove(purchase: Purchase): Unit
}
