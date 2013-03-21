name := "$name$"

version := "0.0.1"

organization := "$package$"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "Wooden Stake Repo" at "https://repo.woodenstake.se/all"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  Seq()
}