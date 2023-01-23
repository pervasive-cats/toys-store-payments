/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.purchase.entities

import scala.language.postfixOps
import payments.purchase.valueobjects.{CatalogItem, PurchaseId, Store}
import payments.customer.entities.Customer

import java.time.LocalDateTime

trait Purchase {

  val purchaseId: PurchaseId

  val cartContents: List[CatalogItem]

  val store: Store

  val customer: Customer

  val timestamp: LocalDateTime
}
