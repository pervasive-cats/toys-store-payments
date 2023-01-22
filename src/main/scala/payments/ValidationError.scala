package io.github.pervasivecats
package payments

type Validated[A] = Either[ValidationError, A]
trait ValidationError {

  val message: String
}
