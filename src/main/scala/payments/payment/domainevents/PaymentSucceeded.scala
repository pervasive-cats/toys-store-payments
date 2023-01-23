/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.payment.domainevents

import payments.payment.valueobjects.PaymentId

trait PaymentSucceeded {

  val paymentId: PaymentId
}
