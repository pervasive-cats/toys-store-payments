/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.purchase

import java.time.LocalDateTime

import payments.purchase.valueobjects.{PurchaseId, Store}
import payments.customer.valueobjects.Email
import payments.purchase.entities.Purchase

trait Repository {

  def findById(id: PurchaseId): Purchase

  def findByEmail(email: Email): List[Purchase]

  def findByStore(store: Store): List[Purchase]

  def findByDateRange(startDate: LocalDateTime, endDate: LocalDateTime): List[Purchase]

  def add(purchase: Purchase): Unit

  def remove(purchase: Purchase): Unit
}
