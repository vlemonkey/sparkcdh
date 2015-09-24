name := "sparkcdh"

version := "1.0"

scalaVersion := "2.10.4"

resolvers ++= Seq(
        "maven Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.3.0-cdh5.4.0",
  "org.apache.spark" % "spark-assembly_2.10" % "1.3.0-cdh5.4.0" % "provided",
  "org.scalatest" % "scalatest_2.10" % "2.2.0" % "test" ,
  "redis.clients" % "jedis" % "2.1.0",
  "net.debasishg" % "redisclient_2.10" % "2.12"
)
