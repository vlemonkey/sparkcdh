package com.test.xml

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

import org.apache.hadoop.io.LongWritable
import org.apache.hadoop.io.Text

/**
 * Created by s on 15-8-7.
 */
object XMLParse {
  def main(args: Array[String]) {
    val conf = new SparkConf()
      .setAppName("XML Parse")
      .setMaster("spark://cloud137:7077")
    val sc = new SparkContext(conf)

    //    val Array(in, out) = args
    val files = sc.newAPIHadoopFile[LongWritable, Text, XMLInputFormat]("hdfs://cloud138:8020/user/tescomm/wxy/xmlin")
    files.first()
  }
}
