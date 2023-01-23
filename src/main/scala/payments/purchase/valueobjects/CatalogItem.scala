package io.github.pervasivecats
package payments.purchase.valueobjects

trait CatalogItem {

  val catalogItemId: CatalogItemId
  val cost: Cost
}
