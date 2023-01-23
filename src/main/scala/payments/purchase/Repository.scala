package io.github.pervasivecats
package payments.purchase

import payments.purchase.valueobjects.{PurchaseId, Store}

import payments.customer.valueobjects.Email
import payments.purchase.entities.Purchase
import jdk.jfr.Timestamp

trait Repository {

  def findById(id: PurchaseId): Purchase
  
  def findByEmail(email: Email): List[Purchase]
  
  def findByStore(store: Store): List[Purchase]
  
  def findByDateRange(startDate: Timestamp, endDate: Timestamp): List[Purchase]
  
  def add(purchase: Purchase): Unit
  
  def remove(purchase: Purchase): Unit
}
