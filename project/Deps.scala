import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Deps {
  import Def.{setting => s}

  val scalatest = s("org.scalatest" %%% "scalatest" % "3.2.15")

  val cats = new {
    val core   = s("org.typelevel" %%% "cats-core" % "2.9.0")
    val effect = s("org.typelevel" %%% "cats-effect" % "3.4.7")
    val alley  = s("org.typelevel" %%% "alleycats-core" % "2.9.0")
  }

  val scalaJS = new {
    val secureRandom = s("org.scala-js" %%% "scalajs-java-securerandom" % "1.0.0")
  }

  val awsLambdaJS = s("net.exoego" %%% "aws-lambda-scalajs-facade" % "0.12.1")
}
