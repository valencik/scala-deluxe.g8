lazy val ScalaTestVersion = "$scalatest_version$"

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "$organization$",
      scalaVersion := "$scala_version$",
      version := "0.1.0-SNAPSHOT",
      coverageMinimum := $coverage$
    )
  ),
  name := "$name$",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % ScalaTestVersion % Test
  )
)
