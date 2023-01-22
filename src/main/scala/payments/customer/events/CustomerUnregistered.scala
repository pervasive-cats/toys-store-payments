package io.github.pervasivecats
package payments.customer.events

import payments.customer.valueobjects.Email

trait CustomerUnregistered {

  val email: Email
}
