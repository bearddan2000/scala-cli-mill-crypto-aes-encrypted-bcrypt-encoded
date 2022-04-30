import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object CLI extends ScalaModule {
    def scalaVersion = "2.13.1"

    def ivyDeps = Agg(
      ivy"javax.xml.bind:jaxb-api:2.3.1",
      ivy"org.mindrot:jbcrypt:0.4",
      ivy"commons-codec:commons-codec:1.15"
    )
}
