enablePlugins(GatlingPlugin)

scalaVersion := "2.11.4"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.0-SNAPSHOT" % "it,test"

libraryDependencies += "io.gatling" % "gatling-bundle" % "2.1.0-SNAPSHOT" % "test, it" artifacts Artifact("gatling-bundle", "zip", "zip", "bundle")

libraryDependencies += "io.gatling" % "test-framework" % "1.1-SNAPSHOT" % "it,test"
