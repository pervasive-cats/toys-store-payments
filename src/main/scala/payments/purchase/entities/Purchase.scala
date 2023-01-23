package io.github.pervasivecats
package payments.purchase.entities

import payments.purchase.valueobjects.{CatalogItem, PurchaseId, Store}
import payments.customer.entities.Customer

import jdk.jfr.Timestamp

import scala.language.postfixOps

trait Purchase {

  val purchaseId: PurchaseId
  val cartContents: List[CatalogItem]
  val store: Store
  val customer: Customer
  val timestamp: Timestamp
}
