package lgbt.mystic.foundation.concrete

import org.gradle.api.provider.Property

interface ConcreteExtension {
  val paperVersionGroup: Property<String>
  val paperApiVersion: Property<String>
  val minecraftServerPath: Property<String>
  val acceptServerEula: Property<Boolean>
}
