package soo.soos.kafka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

import scala.Tuple2;

public class ConsumerExam2 {
	 private static final Pattern SPACE = Pattern.compile(" ");
	 private static String zkQuorum = "localhost:";
	 private static String group = "test-group";
	 private static String topics = "test";
	 private final static String numThreads = "20";
//	 public static void main(String[] args) throws Exception {
//
////		    StreamingExamples.setStreamingLogLevels();
//		    SparkConf sparkConf = new SparkConf().setAppName("JavaKafkaWordCount").setMaster("local");
//		    
//		    // Create the context with 2 seconds batch size
//		    JavaStreamingContext jssc = new JavaStreamingContext(sparkConf, new Duration(2000));
//
//		    int numThreads = Integer.parseInt("20");
//		    Map<String, Integer> topicMap = new HashMap<>();
//		    String[] topics = "test".split(",");
//		    for (String topic: topics) {
//		      topicMap.put(topic, numThreads);
//		    }
//
//		    JavaPairReceiverInputDStream<String, String> messages =
//		    		kafka.consumer.ZookeeperConsumerConnector.kafka$consumer$ZookeeperConsumerConnector$$reinitializeConsumer(ZookeeperConsumerConnector.scala:967)          KafkaUtils.createStream(jssc, zkQuorum, group, topicMap);
//
//		    JavaDStream<String> lines = messages.map(new Function<Tuple2<String, String>, String>() {
//		      public String call(Tuple2<String, String> tuple2) {
//		        return tuple2._2();
//		      }
//		    });
//
//		    JavaDStream<String> words = lines.flatMap(new FlatMapFunction<String, String>() {
//		      private String x;
//
//			public Iterable<String> call(String x) {
//				return (Iterable<String>) Arrays.asList(SPACE.split(x)).iterator();
//		      }
//		    });
//
//		    JavaPairDStream<String, Integer> wordCounts = words.mapToPair(
//		      new PairFunction<String, String, Integer>() {
//		        public Tuple2<String, Integer> call(String s) {
//		          return new Tuple2(s, 1);
//		        }
//		      }).reduceByKey(new Function2<Integer, Integer, Integer>() {
//		        public Integer call(Integer i1, Integer i2) {
//		          return i1 + i2;
//		        }
//		      });
//
//		    wordCounts.print();
//		    jssc.start();
//		    jssc.awaitTermination();
//		  }


}
