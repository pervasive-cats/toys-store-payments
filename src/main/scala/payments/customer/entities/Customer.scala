/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.customer.entities

import payments.customer.valueobjects.Email
import payments.customer.valueobjects.card.PaymentCard

trait Customer {

  val email: Email

  val paymentCard: PaymentCard
}
