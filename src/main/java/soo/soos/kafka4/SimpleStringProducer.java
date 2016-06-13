package soo.soos.kafka4;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class SimpleStringProducer {
	 public static void main(String[] args) {
	        Properties props = new Properties();
	        props.put("bootstrap.servers", "localhost:9092");
	        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

	        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
	        for (int i = 0; i < 100; i++) {
	            ProducerRecord<String, String> record = new ProducerRecord<>("test8888", "value-" + i);
	            producer.send(record);
	            System.out.println(i);
	        }
	        System.out.println("complete Producing");
	        producer.close();
	    }
}
