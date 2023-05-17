package objektwerks

import scala.collection.mutable

class Validations:
  type Field = String
  type Message = String

  private val map = mutable.HashMap[Field, Message]()

  def isValid: Boolean = map.size == 0

  def add(field: Field, message: Message): Unit = map += field -> message

  def get(field: Field): Option[Message] = map.get(field)

  def collect: Map[Field, Message] = map.toMap