/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.customer.events

import payments.customer.valueobjects.Email

trait CustomerUnregistered {

  val email: Email
}
