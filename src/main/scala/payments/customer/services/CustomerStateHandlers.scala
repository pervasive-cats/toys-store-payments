/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package payments.customer.services

import payments.customer.domainevents.CustomerUnregistered

trait CustomerStateHandlers {

  def onCustomerUnregistered(event: CustomerUnregistered): Unit
}
