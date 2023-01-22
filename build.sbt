import Dependencies._

Global / onChangedBuildSource := ReloadOnSourceChanges

Global / excludeLintKeys := Set(idePackagePrefix)

ThisBuild / scalaVersion := "3.2.2-RC2"

ThisBuild / scalafixDependencies ++= Seq(
  "com.github.liancheng" %% "organize-imports" % "0.6.0",
  "io.github.ghostbuster91.scalafix-unified" %% "unified" % "0.0.8",
  "net.pixiv" %% "scalafix-pixiv-rule" % "3.0.1"
)

ThisBuild / idePackagePrefix := Some("io.github.pervasivecats")

lazy val root = project
  .in(file("."))
  .enablePlugins(AutomateHeaderPlugin)
  .settings(
    name := "toys-store-payments",
    scalacOptions ++= Seq(
      "-deprecation",
      "-Xfatal-warnings"
    ),
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    libraryDependencies ++= Seq(
      scalactic,
      scalatest,
      refined
    ),
    wartremoverErrors ++= Warts.allBut(Wart.ImplicitParameter),
    version := "1.0.0-beta.1",
    coverageEnabled := true,
    coverageMinimumStmtTotal := 80,
    coverageMinimumBranchTotal := 80,
    headerLicense := Some(
      HeaderLicense.Custom(
        """|Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
           |
           |All Rights Reserved.
           |""".stripMargin
      )
    ),
    assembly / assemblyJarName := "main.jar",
    assembly / mainClass := Some("io.github.pervasivecats.Main"),
  )
