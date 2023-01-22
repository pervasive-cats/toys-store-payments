package io.github.pervasivecats
package payments.customer.services

import payments.customer.events.CustomerUnregistered

trait CustomerStateHandlers {

  def onCustomerUnregistered(event: CustomerUnregistered): Unit
}
