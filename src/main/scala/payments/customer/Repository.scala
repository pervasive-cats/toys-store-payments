/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.customer

import payments.customer.valueobjects.paymentcard.PaymentCard
import payments.customer.entities.Customer
import payments.customer.valueobjects.Email

trait Repository {

  def findByEmail(email: Email): Customer

  def register(customer: Customer): Unit

  def update(customer: Customer, email: Email, paymentCard: PaymentCard): Unit

  def unregister(customer: Customer): Unit
}
